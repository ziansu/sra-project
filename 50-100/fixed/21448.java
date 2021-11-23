public void updateAutonomousPeriodic() {
    if ((autonomousStartTime) < 0) {
        autonomousStartTime = java.lang.System.currentTimeMillis();
    }
    long timeSinceStart = (java.lang.System.currentTimeMillis()) - (autonomousStartTime);
    switch (this.autonomousType) {
        case NO_AUTO :
            noAuto();
            break;
        case DRIVE_ONLY :
            driveOnly(timeSinceStart);
            break;
        case GRAB_CAN :
            grabCan(timeSinceStart);
            break;
        case HOOK_AND_PUSH :
            hookAndPush(timeSinceStart);
            break;
    }
}