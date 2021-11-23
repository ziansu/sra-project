private static float[] randomFloats(int size) {
    float[] weights = new float[size];
    for (int i = 0; i < (weights.length); i++) {
        weights[i] = (((randomFloat()) * (randomBoolean() ? 1.0F : -1.0F)) * (randomInt(100))) + 1.0E-5F;
    }
    return weights;
}