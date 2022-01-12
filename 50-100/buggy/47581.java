@java.lang.Override
protected void controlUpdate(float tpf) {
    final long updateTime = 200;
    long currentTime = java.lang.System.currentTimeMillis();
    long delta = currentTime - (lastTime);
    if (delta > updateTime) {
        lastTime = currentTime;
        sunRotation += 0.009F;
        if ((sunRotation) >= (2 * (com.jme3.math.FastMath.PI))) {
            sunRotation = 0.0F;
        }
        spatial.setLocalRotation(sunQuat.fromAngles(0, 0, sunRotation));
    }
}