public void start() {
    checkRootPermission();
    if (configureProperties()) {
        configureScheduling();
    }
}