public void logInEverywhere() {
    logInfo("Attempting login everywhere.");
    for (java.lang.String languageCode : mdm.getWikiPrefixes()) {
        logInAt(languageCode);
    }
}