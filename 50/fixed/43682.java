private boolean isRemote(java.lang.String url) {
    return com.truckmovers.cordova.RemoteInjectionPlugin.REMOTE_URL_REGEX.matcher(((java.lang.String) (url))).matches();
}