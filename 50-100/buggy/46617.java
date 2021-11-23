private float calcPercent(final int primary, final int... others) {
    float sum = primary;
    for (int num : others) {
        sum += num;
    }
    if (sum == 0)
        return 0.0F;
    
    if (sum == primary)
        return 100.0F;
    
    return (primary / sum) * 100;
}