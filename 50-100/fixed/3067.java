public com.google.gson.JsonElement getRawJson(java.lang.String url) throws java.io.IOException {
    if ((this.mockResponse) != null) {
        return new com.google.gson.JsonParser().parse(this.mockResponse);
    }else {
        return new com.google.gson.JsonParser().parse(invokeGET(url).execute().parseAsString());
    }
}