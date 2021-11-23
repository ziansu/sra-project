private void getClientSecrets() {
    try {
        w094j.ctrl8.database.GoogleStorage.logger.info("Getting client secrets...");
        this.clientSecrets = com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets.load(w094j.ctrl8.database.GoogleStorage.jsonFactory, new java.io.InputStreamReader(w094j.ctrl8.database.GoogleStorage.class.getResourceAsStream(this.CLIENT_SECRETS_FILE)));
    } catch (java.lang.Exception e) {
        w094j.ctrl8.database.GoogleStorage.logger.debug(((this.CLIENT_SECRETS_FILE) + (w094j.ctrl8.database.GoogleStorage.ERROR_MESSAGE_FILE_NOT_FOUND)));
        java.lang.System.err.println(((this.CLIENT_SECRETS_FILE) + (w094j.ctrl8.database.GoogleStorage.ERROR_MESSAGE_FILE_NOT_FOUND)));
        java.lang.System.exit(1);
    }
}