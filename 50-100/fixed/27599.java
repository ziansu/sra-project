public void setIsCrouching(boolean val) {
    if (!(isDead)) {
        if (val) {
            currCrouchNum = 0;
            standingTimer.stop();
            crouchingTimer.start();
        }else {
            crouchingTimer.stop();
            standingTimer.start();
        }
    }
}