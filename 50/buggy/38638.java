public void endDriveThread() {
    if (driveThread.isAlive()) {
        driveThread.interrupt();
    }
    if (autonomousThread.isAlive()) {
        autonomousThread.interrupt();
    }
    this.relativeDrive = true;
    vectorDriveActive = false;
}