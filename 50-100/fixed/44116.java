@org.springframework.web.bind.annotation.RequestMapping(value = controllers.EditPageController.EDIT_PAGE_URL, method = org.springframework.web.bind.annotation.RequestMethod.DELETE)
public void deletePage(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp, @org.springframework.web.bind.annotation.RequestParam
java.lang.String uri) {
    if (isLandingPage(pageManagementUseCase.getPageByUri(uri).getSite(), uri)) {
        resp.setStatus(400);
        return ;
    }
    if (editPageUseCase.wasPublished(uri)) {
        editPageUseCase.deleteCorrespondingPublishedPage(uri);
    }
    editPageUseCase.deletePageByUri(uri);
    resp.setStatus(200);
}