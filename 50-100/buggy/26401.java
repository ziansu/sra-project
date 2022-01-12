public double getRawAnalogStickALX() {
    try {
        if (((gp1.getRawAxis(0)) > 0.1) || ((gp1.getRawAxis(0)) < (-0.1)))
            return gp1.getRawAxis(0);
        
    } catch (java.lang.Exception e) {
    }
    try {
        xbox.getRawAxis(0);
    } catch (java.lang.Exception e) {
    }
    return 0.0;
}