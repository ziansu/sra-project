private void processHttpVerbs(org.wso2.carbon.apimgt.webapp.publisher.API api) {
    for (org.wso2.carbon.apimgt.webapp.publisher.URITemplate uriTemplate : api.getUriTemplates()) {
        java.lang.String httpVerbString = uriTemplate.getHTTPVerb();
        java.lang.String[] httpVerbs = uriTemplate.getMethodsAsString().split(" ");
        boolean httpVerbStringExistsMethods = false;
        for (java.lang.String aHttpVerb : httpVerbs) {
            if (aHttpVerb.trim().equalsIgnoreCase(httpVerbString)) {
                httpVerbStringExistsMethods = true;
                break;
            }
        }
        if (!httpVerbStringExistsMethods) {
            uriTemplate.setHttpVerbs(httpVerbString);
        }
    }
}