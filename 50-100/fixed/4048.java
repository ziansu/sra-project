private java.lang.String getRequestBody(org.apache.http.HttpRequest req) throws java.io.IOException {
    if (req instanceof org.apache.http.HttpEntityEnclosingRequest) {
        org.apache.http.HttpEntity body = ((org.apache.http.HttpEntityEnclosingRequest) (req)).getEntity();
        if (body == null) {
            return "";
        }else {
            return org.apache.commons.io.IOUtils.toString(body.getContent());
        }
    }else {
        return "";
    }
}