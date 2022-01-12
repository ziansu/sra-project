private void fetchWeather() {
    if ((apiClient) != null)
        apiClient.get(postalCode);
    
}