private void handleErrorIfNecessary(org.apache.http.HttpResponse response) throws java.io.IOException {
    if ((response.getStatusLine().getStatusCode()) >= 400) {
        com.kenticocloud.delivery.KenticoError kenticoError = objectMapper.readValue(response.getEntity().getContent(), com.kenticocloud.delivery.KenticoError.class);
        throw new com.kenticocloud.delivery.KenticoErrorException(kenticoError);
    }else
        if ((response.getStatusLine().getStatusCode()) >= 500) {
            throw new java.io.IOException("Unknown error with Kentico API.  Kentico is likely suffering site issues.");
        }
    
}