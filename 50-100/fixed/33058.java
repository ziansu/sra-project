public void autonomous3() {
    Drive.robotDrive.tankDrive(leftCurrentSpeed, rightCurrentSpeed);
    if (!(timer.isRunning())) {
        switch (autonCounter) {
            case 0 :
                break;
            case 1 :
                break;
            case 2 :
                break;
        }
    }
}