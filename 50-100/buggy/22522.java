private void enableClimb() {
    if (onClimbable) {
        if (inputControls.jumpButtonPressed) {
            if ((lookStartTime) == 0) {
                canLook = false;
                canClimb = true;
            }
        }else {
            climbTimeSeconds = 0;
        }
        handleXInputs();
        handleYInputs();
    }else {
        canClimb = false;
    }
}