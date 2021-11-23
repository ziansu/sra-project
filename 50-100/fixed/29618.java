protected boolean motionSensorReportsMovement() throws com.medziku.motoresponder.utils.AccelerometerNotAvailableException {
    try {
        return this.motionUtility.isDeviceInMotion().get();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    } catch (java.util.concurrent.ExecutionException e) {
        e.printStackTrace();
    }
    return false;
}