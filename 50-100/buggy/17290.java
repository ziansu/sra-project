protected boolean auth(java.lang.String apiKey, java.lang.String accessToken) {
    apiKey = normalize(apiKey);
    accessToken = normalize(accessToken);
    if ((apiKey.equals(de.hwrberlin.it2014.sweproject.rest.Resource.API_KEY)) && (accessToken.equals(de.hwrberlin.it2014.sweproject.rest.Resource.ACCESS_TOKEN))) {
        return true;
    }else {
        return false;
    }
}