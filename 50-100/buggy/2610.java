public java.util.List<com.tradeshift.thirdparty.samples.springboot.domain.dto.BaseTradeshiftDocumentDTO> getDocuments(java.lang.String documentType) throws java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
    com.tradeshift.thirdparty.samples.springboot.services.Impl.TradeshiftDocumentRetrievalServiceImpl.LOGGER.info(("get List of documents by document type " + documentType), com.tradeshift.thirdparty.samples.springboot.services.Impl.TradeshiftDocumentRetrievalServiceImpl.class);
    java.lang.String documentsUri = URI_LIST_DOCUMENTS;
    org.springframework.web.client.RestTemplate restTemplate = new org.springframework.web.client.RestTemplate();
    org.springframework.http.HttpEntity<java.lang.String> requestEntity = tokenService.getRequestHttpEntityWithAccessToken();
    org.springframework.http.ResponseEntity<?> responseEntity = restTemplate.exchange(documentsUri, HttpMethod.GET, requestEntity, java.lang.String.class, documentType, 25, 0);
    return parseDocuments(responseEntity);
}