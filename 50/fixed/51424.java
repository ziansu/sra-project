private void handleFileExtensionErrors() {
    if (m_requestHeaders.get("errors").equals("none")) {
        webserver.HTTPResponseCode BadReqcode = HTTPResponseCode.BAD_REQUEST;
        m_requestHeaders.put("errors", BadReqcode.displayName());
    }
}