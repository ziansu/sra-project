protected boolean motionSensorReportsMovement() throws com.medziku.motoresponder.utils.AccelerometerNotAvailableException {
    try {
        java.lang.Boolean result = this.motionUtility.isDeviceInMotion(this.settings.getAccelerationRequiredToMotion()).get();
        if (result == null) {
            throw new com.medziku.motoresponder.utils.AccelerometerNotAvailableException();
        }
        return result;
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    } catch (java.util.concurrent.ExecutionException e) {
        e.printStackTrace();
    }
    return false;
}