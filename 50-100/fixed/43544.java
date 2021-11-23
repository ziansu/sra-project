private double shortestAngle(double currentAngle, double targetAngle) {
    double rawDeltaAngle = computeError(currentAngle, targetAngle);
    if ((java.lang.Math.abs(rawDeltaAngle)) > 180) {
        if (rawDeltaAngle > 0) {
            return rawDeltaAngle - 360;
        }else
            if (rawDeltaAngle < 0) {
                return rawDeltaAngle + 360;
            }else {
                return 0;
            }
        
    }else {
        return rawDeltaAngle;
    }
}