protected boolean outOfRange() {
    double dist;
    dist = java.lang.Math.sqrt(java.lang.Math.abs(((((x) - (xOrigin)) * ((x) - (xOrigin))) + (((y) - (yOrigin)) * ((y) - (yOrigin))))));
    if (dist > (range))
        return true;
    
    return false;
}