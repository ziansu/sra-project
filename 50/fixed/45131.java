public boolean isEnabled(int mode) {
    boolean enabled = false;
    if (mode == (org.usfirst.frc3824.HolonomicDrive.Constants.FORKLIFT_POSITION_MODE)) {
        enabled = positionPID.isEnable();
    }else {
        enabled = velocityPID.isEnable();
    }
    return enabled;
}