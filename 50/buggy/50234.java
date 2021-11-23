public static final float clamp(float min, float max, float x) {
    if (x < min)
        return min;
    
    if (x > max)
        return max;
    
    return x;
}