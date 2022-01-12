public com.reizes.shiva2.http.RestClientResponse postJsonString(java.lang.String requestUri, java.util.Map<java.lang.String, java.lang.String> headers, java.lang.String jsonData) throws java.io.IOException {
    return postString(requestUri, headers, jsonData, "application/json");
}