@org.springframework.web.bind.annotation.RequestMapping(value = controllers.EditSiteController.EDIT_SITE_URL, method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView editSite(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp, @org.springframework.web.bind.annotation.RequestParam
java.lang.String uri, @org.springframework.web.bind.annotation.RequestParam
java.lang.String name, @org.springframework.web.bind.annotation.RequestParam
java.lang.String landingPage) {
    try {
        addSiteUseCase.validateSite(name, uri);
        saveNewSite(uri, name, landingPage);
    } catch (usecases.exceptions.SiteValidationException e) {
        java.lang.String errorMessage = errorMessageMap.get(e.getSiteValidationExceptionCause());
        controllers.EditSiteController.logger.warn(errorMessage);
        setProperAttributes(req, uri, errorMessage);
        return new org.springframework.web.servlet.ModelAndView(controllers.EditSiteController.BASE_JSP);
    }
    return new org.springframework.web.servlet.ModelAndView(controllers.EditSiteController.REDIRECT_SITE_MANAGEMENT);
}