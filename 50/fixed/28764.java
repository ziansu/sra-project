@org.springframework.web.bind.annotation.RequestMapping(value = "/search", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = { "application/json" })
public java.util.List<com.phantom.entity.ActivitiesDocument> searchReasults(@org.springframework.web.bind.annotation.RequestParam(value = "category", required = false)
java.lang.String category) {
    if (null == category) {
        return activitiesDocumentDao.fetchAllDocuments();
    }else {
        return activitiesDocumentDao.fetchActivitiesBasedOnCategory(category);
    }
}