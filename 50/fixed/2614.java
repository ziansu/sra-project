public void addByteArrayPostParam(final byte[] data) {
    com.squareup.okhttp.MediaType mediaType = com.squareup.okhttp.MediaType.parse("application/octet-stream");
    requestBody = com.squareup.okhttp.RequestBody.create(mediaType, data);
}