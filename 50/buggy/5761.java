static float clampToJointRange(float value, float maxDisplacement) {
    if (value > maxDisplacement)
        return maxDisplacement;
    
    if (value < (-maxDisplacement))
        return maxDisplacement;
    
    return value;
}