public void addMultiPartPostParam(java.lang.String key, java.lang.String value) {
    if ((multipartBuilder) == null) {
        multipartBuilder = new com.squareup.okhttp.MultipartBuilder().type(MultipartBuilder.FORM);
    }
    multipartBuilder.addFormDataPart(key, value);
}