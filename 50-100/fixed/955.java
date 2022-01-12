private org.duracloud.common.web.RestHttpHelper.HttpResponse addContentItem(java.lang.String contentId) throws java.lang.Exception {
    java.lang.String url = ((((BaseRestTester.baseUrl) + "/") + (BaseRestTester.spaceId)) + "/") + contentId;
    java.util.Map<java.lang.String, java.lang.String> headers = new java.util.HashMap<java.lang.String, java.lang.String>();
    return BaseRestTester.restHelper.put(url, new java.io.ByteArrayInputStream(org.duracloud.integration.durastore.rest.TestContentRest.CONTENT.getBytes()), "text/plain", org.duracloud.integration.durastore.rest.TestContentRest.CONTENT.length(), headers);
}