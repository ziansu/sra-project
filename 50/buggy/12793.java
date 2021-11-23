public io.swagger.client.ApiClient getApiClient() {
    if ((apiClient) == null) {
        apiClient = new io.swagger.client.ApiClient(info.hossainkhan.mediumsample.core.MediumApplication.AUTH_ID_API_KEY_TOKEN, (((info.hossainkhan.mediumsample.core.MediumApplication.BEARER) + " ") + (info.hossainkhan.mediumsample.core.MediumApplication.MEDIUM_USER_INTEGRATION_TOKEN)));
        apiClient.createDefaultAdapter();
    }
    return apiClient;
}