private double internalNextDouble(double origin, double bound) {
    double r = ((nextLong()) >>> 11) * (org.blockartistry.util.XorShiftRandom.DOUBLE_UNIT);
    if (origin < bound) {
        r = (r * (bound - origin)) + origin;
        if (r >= bound)
            r = java.lang.Double.longBitsToDouble(((java.lang.Double.doubleToLongBits(bound)) - 1));
        
    }
    return r;
}