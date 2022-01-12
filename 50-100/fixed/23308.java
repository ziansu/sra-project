public static com.airmap.airmapsdk.networking.services.AirMap init(java.lang.String apiKey, java.lang.String authToken, boolean pinCertificates) {
    if (com.google.common.base.Strings.isNullOrEmpty(apiKey)) {
        throw new java.lang.IllegalArgumentException("apiKey can't be null or empty");
    }
    authToken = (authToken == null) ? "" : authToken;
    com.airmap.airmapsdk.networking.services.AirMap.ourInstance = new com.airmap.airmapsdk.networking.services.AirMap(apiKey, authToken, pinCertificates);
    com.airmap.airmapsdk.networking.services.AirMap.airMapTrafficService = new com.airmap.airmapsdk.networking.services.TrafficService();
    com.airmap.airmapsdk.networking.services.AirMap.airMapMapMappingService = new com.airmap.airmapsdk.networking.services.MappingService();
    return com.airmap.airmapsdk.networking.services.AirMap.ourInstance;
}