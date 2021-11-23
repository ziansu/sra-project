@org.ednovo.gooru.core.security.AuthorizeOperations(operations = { org.ednovo.gooru.core.constant.GooruOperationConstants.OPERATION_SCOLLECTION_UPDATE })
@org.springframework.transaction.annotation.Transactional(readOnly = false, propagation = org.springframework.transaction.annotation.Propagation.REQUIRED, rollbackFor = java.lang.Exception.class)
@org.springframework.web.bind.annotation.RequestMapping(value = { "/reject/collections" }, method = { org.springframework.web.bind.annotation.RequestMethod.PUT })
public org.springframework.web.servlet.ModelAndView updateCollectionForRejection(@org.springframework.web.bind.annotation.RequestBody
java.lang.String data, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception {
    org.ednovo.gooru.core.api.model.User user = ((org.ednovo.gooru.core.api.model.User) (request.getAttribute(Constants.USER)));
    java.util.List<java.util.Map<java.lang.String, java.lang.String>> collection = buildUpdatesPublishStatusFromInputParameters(data);
    return toModelAndViewWithIoFilter(getCollectionService().updateCollectionForReject(collection, user), org.ednovo.gooru.controllers.v2.api.RESPONSE_FORMAT_JSON, org.ednovo.gooru.controllers.v2.api.EXCLUDE_ALL, true, org.ednovo.gooru.controllers.v2.api.COLLECTION_INCLUDE_FIELDS);
}