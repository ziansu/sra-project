protected float[] recursivelowPass(float factor, float[] input, float[] output) {
    float a0 = 1 - factor;
    float b1 = factor;
    for (int i = 0; i < (input.length); i++) {
        output[i] = (a0 * (input[i])) + (b1 * (output[i]));
    }
    return output;
}