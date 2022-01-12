private static double translatePreference(int p) {
    int maxValue = 9;
    int minValue = -9;
    if (p > maxValue)
        p = maxValue;
    
    if (p < minValue)
        p = minValue;
    
    if (p == 0) {
        return 1;
    }else
        if (p > 0) {
            return p;
        }else {
            return 1.0 / (java.lang.Math.abs(p));
        }
    
}