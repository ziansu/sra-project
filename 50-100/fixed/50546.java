private static float[] randomFloats(int size) {
    float[] values = new float[size];
    for (int i = 0; i < (values.length); i++) {
        values[i] = (((randomFloat()) * (randomBoolean() ? 1.0F : -1.0F)) * (randomInt(100))) + 1.0E-5F;
    }
    return values;
}