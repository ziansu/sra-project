protected float GetEnergy(float x, float y, float z) {
    float Energy = 0.0F;
    Energy = ((float) (java.lang.Math.sqrt((((x * x) + (y * y)) + (z * z)))));
    return Energy;
}