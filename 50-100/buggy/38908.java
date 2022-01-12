public void init() {
    app.uploadStartedHandlers.add(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            applicationStartedUploading();
        }
    });
    app.uploadStoppedHandlers.add(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            applicationStoppedUploading();
        }
    });
    applicationStoppedUploading();
    applicationStartedUploading();
    blockForm();
}