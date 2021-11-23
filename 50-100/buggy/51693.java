public double getRawAnalogStickALY() {
    try {
        if (((gp1.getRawAxis(1)) > 0.1) || ((gp1.getRawAxis(1)) < (-0.1)))
            return gp1.getRawAxis(1);
        
    } catch (java.lang.Exception e) {
    }
    try {
        xbox.getRawAxis(1);
    } catch (java.lang.Exception e) {
    }
    return 0.0;
}