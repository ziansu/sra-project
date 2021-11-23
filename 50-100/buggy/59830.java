public void run() {
    java.lang.System.out.println("starting uploadFile in new thread...");
    if (cloudService == "GoogleDrive") {
        try {
            googleDriveController.uploadFile(file);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    if (cloudService == "Dropbox") {
    }
}