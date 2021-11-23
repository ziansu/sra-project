public void setNotificationKeys(java.util.List<java.lang.String> notificationKey) {
    this.notificationKeys.clear();
    if ((notificationKey.size()) <= 10) {
        this.notificationKeys = notificationKey;
    }else {
        java.lang.System.err.printf("cannot add new notificationKey List due to being bigger than maxSize");
    }
}