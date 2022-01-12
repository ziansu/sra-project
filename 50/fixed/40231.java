java.lang.String getMaxTemp() {
    if ((mMaxTemp) == (-990))
        return java.lang.Integer.toString((-99));
    
    return java.lang.Integer.toString(((int) (java.lang.Math.round(mMaxTemp))));
}