public long setDoubleValue(long flags, double value) {
    if (java.lang.Double.isNaN(value))
        throw new java.lang.IllegalArgumentException("Value cannot be NaN");
    
    long tmpValue = java.lang.Math.round((value / (factor)));
    checkValue(((long) (tmpValue * (factor))));
    tmpValue <<= shift;
    flags &= ~(mask);
    return flags | tmpValue;
}