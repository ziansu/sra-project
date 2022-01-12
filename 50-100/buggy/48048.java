@org.junit.Test
public void detectListenerWithStartShakeDetectionWithCustomThreshold() {
    addSensor(android.hardware.Sensor.TYPE_ACCELEROMETER);
    com.github.nisrulz.sensey.ShakeDetector.ShakeListener fakeListener = org.mockito.Mockito.mock(com.github.nisrulz.sensey.ShakeDetector.ShakeListener.class);
    sensey.startShakeDetection(4, fakeListener);
    com.github.nisrulz.sensey.ShakeDetector detector = getDetector(com.github.nisrulz.sensey.ShakeDetector.class);
    if (detector != null) {
        org.junit.Assert.assertTrue("Sensor Manager must contain sensor event listener for shake", shadowSensorManager.hasListener(detector));
    }else {
        org.junit.Assert.fail("There should be shake detector in sensey. If not, please, check last version of class and update reflection accessing to it field");
    }
}