public java.lang.String getApiKey() {
    if ((headerApiKey) == null) {
        headerApiKey = getPropertyByKey(org.ednovo.gooru.server.service.API_KEY);
    }
    return headerApiKey;
}