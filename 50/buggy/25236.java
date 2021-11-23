private static float getGreen(float factor) {
    float color = 0.0F;
    if (factor > 0.8F)
        color = 0.4F + ((0.6F * (factor - 0.8F)) / 0.2F);
    
    return color;
}