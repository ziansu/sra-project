public void setIsCrouching(boolean val) {
    if (!(isDead)) {
        if (((!(isInAir)) && ((currPunchNum) < 0)) && val) {
            currCrouchNum = 0;
            standingTimer.stop();
            crouchingTimer.start();
        }else {
            crouchingTimer.stop();
            standingTimer.start();
        }
    }
}