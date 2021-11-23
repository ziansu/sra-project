@java.lang.Override
protected void notifyListeners(lejos.robotics.objectdetection.Feature feature) {
    super.notifyListeners(feature);
    if (invert) {
        while ((lightSensor.getLightValue()) >= (threshold));
    }else {
        while ((lightSensor.getLightValue()) < (threshold));
    }
}