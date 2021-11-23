public void chooseExposure(int index) {
    try {
        java.lang.Runtime.getRuntime().exec(("/system/v4l2-ctl -d /dev/video4 -c exposure_absolute=" + (exposures[index])));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    exposureIndex = index;
    lastExposureChange = java.lang.System.currentTimeMillis();
}