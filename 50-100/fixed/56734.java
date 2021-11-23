public double getTurnAngle() {
    if (isTargetFound()) {
        diff = ((getCenterX()[getLargestRectNum()]) - ((config.HORIZONTAL_CAMERA_RES_PIXELS) / 2)) / (config.HORIZONTAL_CAMERA_RES_PIXELS);
        return (diff) * (config.HFOV_DEGREES);
    }else {
        return 0;
    }
}