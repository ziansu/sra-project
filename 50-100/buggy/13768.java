@org.recap.controller.ResponseBody
@org.recap.controller.RequestMapping(value = "/search", method = RequestMethod.POST, params = "action=last")
public org.springframework.web.servlet.ModelAndView searchLast(@javax.validation.Valid
@org.recap.controller.ModelAttribute(value = "searchRecordsRequest")
org.recap.model.search.SearchRecordsRequest searchRecordsRequest, org.springframework.validation.BindingResult result, org.springframework.ui.Model model) {
    searchRecordsRequest.setSearchResultRows(null);
    searchRecordsRequest.setPageNumber(((searchRecordsRequest.getTotalPageCount()) - 1));
    searchRecordsRequest.setOperationType("");
    java.util.List<org.recap.model.solr.BibItem> bibItems = bibSolrDocumentRepository.search(searchRecordsRequest);
    buildResults(searchRecordsRequest, bibItems);
    return new org.springframework.web.servlet.ModelAndView("searchRecords", "searchRecordsRequest", searchRecordsRequest);
}