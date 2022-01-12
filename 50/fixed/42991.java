public okhttp3.Request getRequest() {
    return new okhttp3.Request.Builder().url(url).header("title", keywords).addHeader("Authorization", ("Bearer " + (token.trim()))).build();
}