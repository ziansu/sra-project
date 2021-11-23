private float calcPercent(final float... values) {
    float sum = 0;
    for (float num : values) {
        sum += num;
    }
    if (sum == 0.0F)
        return 0.0F;
    
    if (sum == (values[0]))
        return 100.0F;
    
    return ((values[0]) / sum) * 100;
}