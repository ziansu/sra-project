public double getLongitude() {
    if (((java.lang.Math.abs(x)) < (MINIMUM_RESOLUTION)) && ((java.lang.Math.abs(y)) < (MINIMUM_RESOLUTION)))
        return 0.0;
    
    return java.lang.Math.atan2(y, x);
}