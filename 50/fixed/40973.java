protected ch.heigvd.amt.gamification.model.Application tryToRetrieveApplication(java.lang.String apiKey) {
    return applicationsManager.retrieveApplicationByApikey(apiKey);
}