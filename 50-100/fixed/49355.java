private void findRotationAcceleration(int iterationTime) {
    if ((((time) + 40) < (java.lang.System.currentTimeMillis())) && ((currentSample) < 10)) {
        rotationSamples[currentSample][0] = sensors.getAngle();
        currentSample += 1;
        changeInTime += (java.lang.System.currentTimeMillis()) - (time);
    }
}