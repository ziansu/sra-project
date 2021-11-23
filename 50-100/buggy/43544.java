private double shortestAngle(double currentAngle, double targetAngle) {
    double rawDeltaAngle = computeError(targetAngle, currentAngle);
    if ((java.lang.Math.abs(rawDeltaAngle)) > 180) {
        if (rawDeltaAngle > 0) {
            return rawDeltaAngle - 360;
        }else
            if (rawDeltaAngle < 0) {
                return 360 + rawDeltaAngle;
            }else {
                return 0;
            }
        
    }else {
        return rawDeltaAngle;
    }
}