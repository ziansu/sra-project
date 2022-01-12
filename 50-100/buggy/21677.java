@org.junit.Test
public void detectListenerWithStartOrientationDetectionWithCustomSmoothness() {
    addSensor(android.hardware.Sensor.TYPE_ACCELEROMETER);
    addSensor(android.hardware.Sensor.TYPE_MAGNETIC_FIELD);
    com.github.nisrulz.sensey.OrientationDetector.OrientationListener fakeListener = org.mockito.Mockito.mock(com.github.nisrulz.sensey.OrientationDetector.OrientationListener.class);
    sensey.startOrientationDetection(3, fakeListener);
    com.github.nisrulz.sensey.OrientationDetector detector = getDetector(com.github.nisrulz.sensey.OrientationDetector.class);
    if (detector != null) {
        org.junit.Assert.assertTrue("Sensor Manager must contain sensor event listener for orientation", shadowSensorManager.hasListener(detector));
    }else {
        org.junit.Assert.fail("There should be orientation detector in sensey. If not, please, check last version of class and update reflection accessing to it field");
    }
}