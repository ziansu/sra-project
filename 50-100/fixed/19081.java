public boolean equals(final rajawali.math.Quaternion other, final double tolerance) {
    double fCos = dot(other);
    if ((fCos > 1.0) && ((fCos - 1.0) < tolerance))
        return true;
    
    double angle = java.lang.Math.acos(fCos);
    return ((java.lang.Math.abs(angle)) <= tolerance) || (rajawali.math.MathUtil.realEqual(angle, MathUtil.PI, tolerance));
}