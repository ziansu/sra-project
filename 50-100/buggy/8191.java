public double getRawAnalogStickARX() {
    try {
        if (((gp1.getRawAxis(2)) > 0.1) || ((gp1.getRawAxis(2)) < (-0.1)))
            return gp1.getRawAxis(2);
        
    } catch (java.lang.Exception e) {
    }
    try {
        xbox.getRawAxis(2);
    } catch (java.lang.Exception e) {
    }
    return 0.0;
}