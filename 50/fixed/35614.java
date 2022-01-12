public float calcProbability(float sum, float b) {
    float AE = (-b) - sum;
    return ((float) (1 / (1 + (java.lang.Math.exp(AE)))));
}