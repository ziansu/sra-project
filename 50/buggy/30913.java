private boolean motionSensorReportsMovement() {
    try {
        return this.motionUtility.isDeviceInMotion().get();
    } catch (java.lang.UnsupportedOperationException e) {
        return true;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return false;
}