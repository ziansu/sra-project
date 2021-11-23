private void processHttpVerbs(org.wso2.carbon.apimgt.webapp.publisher.API api) {
    for (org.wso2.carbon.apimgt.webapp.publisher.URITemplate uriTemplate : api.getUriTemplates()) {
        java.lang.String httpVerbString = uriTemplate.getHTTPVerb();
        if ((httpVerbString != null) && (!(httpVerbString.isEmpty()))) {
            uriTemplate.setHttpVerbs(httpVerbString);
        }
    }
}