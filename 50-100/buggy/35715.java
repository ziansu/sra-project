private void requestAuthorization(boolean read, boolean write) {
    java.util.List<java.lang.String> permissions = new java.util.ArrayList<>();
    if (read) {
        permissions.add(com.terikon.cordova.photolibrary.PhotoLibrary.READ_EXTERNAL_STORAGE);
    }
    if (write) {
        permissions.add(com.terikon.cordova.photolibrary.PhotoLibrary.WRITE_EXTERNAL_STORAGE);
    }
    cordova.requestPermissions(this, com.terikon.cordova.photolibrary.PhotoLibrary.REQUEST_AUTHORIZATION_REQ_CODE, ((java.lang.String[]) (permissions.toArray())));
}