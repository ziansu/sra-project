public void startVelocity() {
    vectorDriveActive = true;
    driveThreadActive = true;
    if (!(driveThread.isAlive()))
        driveThread.start();
    
}