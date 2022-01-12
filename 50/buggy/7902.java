public void event() {
    try {
        zeroGyro(false);
    } catch (java.io.IOException e) {
        ccre.log.Logger.warning("Could not initiate gyro zeroing", e);
    }
}