public void consume() throws java.io.IOException {
    if ((responseAsBytes) != null) {
        discardContent();
        return ;
    }
    responseAsBytes = new byte[0];
    responseCharSet = com.google.common.base.Charsets.UTF_8;
    if ((response) != null) {
        okhttp3.ResponseBody body = response.body();
        if (body != null) {
            responseAsBytes = body.bytes();
            responseCharSet = ((body.contentType()) != null) ? body.contentType().charset(com.google.common.base.Charsets.UTF_8) : com.google.common.base.Charsets.UTF_8;
        }
    }
}