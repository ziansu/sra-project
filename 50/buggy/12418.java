@org.recap.controller.ResponseBody
@org.recap.controller.RequestMapping(value = "/search", method = RequestMethod.POST, params = "action=next")
public org.springframework.web.servlet.ModelAndView searchNext(@javax.validation.Valid
@org.recap.controller.ModelAttribute(value = "searchRecordsRequest")
org.recap.model.search.SearchRecordsRequest searchRecordsRequest, org.springframework.validation.BindingResult result, org.springframework.ui.Model model) {
    searchRecordsRequest.setOperationType(RecapConstants.OPERATION_NEXT);
    searchRecordsRequest.setSearchResultRows(null);
    searchAndBuildResults(searchRecordsRequest);
    return new org.springframework.web.servlet.ModelAndView("searchRecords", "searchRecordsRequest", searchRecordsRequest);
}