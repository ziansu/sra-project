@org.junit.Test
public void detectListenerWithStartProximityDetectionWithCustomThreshold() {
    addSensor(android.hardware.Sensor.TYPE_PROXIMITY);
    com.github.nisrulz.sensey.ProximityDetector.ProximityListener fakeListener = org.mockito.Mockito.mock(com.github.nisrulz.sensey.ProximityDetector.ProximityListener.class);
    sensey.startProximityDetection(10.0F, fakeListener);
    com.github.nisrulz.sensey.ProximityDetector detector = getDetector(com.github.nisrulz.sensey.ProximityDetector.class);
    if (detector != null) {
        org.junit.Assert.assertTrue("Sensor Manager must contain sensor event listener for proximity", shadowSensorManager.hasListener(detector));
    }else {
        org.junit.Assert.fail("There should be proximity detector in sensey. If not, please, check last version of class and update reflection accessing to it field");
    }
}