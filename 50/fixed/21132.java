public void startPosition() {
    vectorDriveActive = false;
    driveThreadActive = true;
    driveThread.start();
}