public void endDriveThread() {
    if (driveThread.isAlive()) {
        driveThread.interrupt();
    }
    this.relativeDrive = true;
    vectorDriveActive = false;
}