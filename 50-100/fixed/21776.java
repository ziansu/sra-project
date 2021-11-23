public static int InterpolateLinear(int a, int b, float weight) {
    if (weight <= 0) {
        return a;
    }else
        if (weight >= 1) {
            return b;
        }
    
    return java.lang.Math.round((a + (((float) (b - a)) * weight)));
}