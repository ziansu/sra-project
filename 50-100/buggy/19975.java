public void update(int delta) {
    if (shift) {
        cameraAngle -= 0.01 * delta;
        angle -= 0.1 * delta;
    }else {
        cameraAngle += 0.01 * delta;
        angle += 0.1 * delta;
    }
    if (((cameraAngle) > 10) || ((cameraAngle) < (-10))) {
        shift = !(shift);
    }
    updateFPS();
}