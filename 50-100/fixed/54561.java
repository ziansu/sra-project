@org.junit.Test
public void detectListenerWithStartFlipDetection() {
    addSensor(android.hardware.Sensor.TYPE_ACCELEROMETER);
    com.github.nisrulz.sensey.FlipDetector.FlipListener fakeListener = org.mockito.Mockito.mock(com.github.nisrulz.sensey.FlipDetector.FlipListener.class);
    sensey.startFlipDetection(fakeListener);
    com.github.nisrulz.sensey.FlipDetector detector = getDetector(fakeListener, com.github.nisrulz.sensey.FlipDetector.class);
    if (detector != null) {
        org.junit.Assert.assertTrue("Sensor Manager must contain sensor event listener for flip", shadowSensorManager.hasListener(detector));
    }else {
        org.junit.Assert.fail("There should be flip detector in sensey. If not, please, check last version of class and update reflection accessing to it field");
    }
}