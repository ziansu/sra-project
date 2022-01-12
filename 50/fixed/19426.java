private java.lang.String getAppId() {
    if ((this.appId) == null) {
        this.appId = java.lang.System.getProperty("APPLICATION_ID");
    }
    return this.appId;
}