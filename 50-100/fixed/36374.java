public org.ojbc.util.model.rapback.IdentificationResultSearchRequest getSearchRequestFromXml(org.w3c.dom.Document report) throws java.lang.Exception {
    org.ojbc.util.model.rapback.IdentificationResultSearchRequest searchRequest = new org.ojbc.util.model.rapback.IdentificationResultSearchRequest();
    org.w3c.dom.Node requestRoot = org.ojbc.util.xml.XmlUtils.xPathNodeSearch(report, "/oirs-req-doc:OrganizationIdentificationResultsSearchRequest");
    java.lang.String resultCategoryCode = org.ojbc.util.xml.XmlUtils.xPathStringSearch(requestRoot, "oirs-req-ext:IdentificationResultsCategoryCode");
    searchRequest.setIdentificationResultCategory(org.apache.commons.lang.StringUtils.trimToNull(resultCategoryCode));
    extractPersonCriteria(searchRequest, requestRoot);
    extractDateRangeCriteria(searchRequest, requestRoot);
    extractStatusCodeCriteria(searchRequest, requestRoot);
    extractCivilReasonCodes(searchRequest, requestRoot);
    extractCriminalReasonCodes(searchRequest, requestRoot);
    return searchRequest;
}