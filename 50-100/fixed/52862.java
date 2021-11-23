private static com.google.api.services.storage.Storage getService() throws java.io.IOException, java.security.GeneralSecurityException {
    if (null == (com.ciandt.techgallery.persistence.dao.storage.StorageDAOImpl.storageService)) {
        com.google.api.client.http.HttpTransport httpTransport = com.google.api.client.googleapis.javanet.GoogleNetHttpTransport.newTrustedTransport();
        com.google.api.client.googleapis.auth.oauth2.GoogleCredential credential = com.google.api.client.googleapis.auth.oauth2.GoogleCredential.getApplicationDefault();
        if (credential.createScopedRequired()) {
            credential = credential.createScoped(com.google.api.services.storage.StorageScopes.all());
        }
        com.ciandt.techgallery.persistence.dao.storage.StorageDAOImpl.storageService = new com.google.api.services.storage.Storage.Builder(httpTransport, com.ciandt.techgallery.persistence.dao.storage.StorageDAOImpl.JSON_FACTORY, credential).setApplicationName(com.ciandt.techgallery.persistence.dao.storage.StorageDAOImpl.APPLICATION_NAME).build();
    }
    return com.ciandt.techgallery.persistence.dao.storage.StorageDAOImpl.storageService;
}