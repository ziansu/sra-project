private void addHeaders(com.sun.jersey.api.client.WebResource.Builder requestBuilder) {
    if ((headers) != null) {
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : headers.entrySet()) {
            requestBuilder = requestBuilder.header(entry.getKey(), entry.getValue());
            java.lang.System.out.println(((("\t\t  " + (entry.getKey())) + ": ") + (entry.getValue())));
        }
    }
}