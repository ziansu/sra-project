public float activated(float[] inputs) {
    int temp = 0;
    for (int i = 0; i < (inputs.length); i++) {
        temp += (inputs[i]) * (weights[i]);
    }
    return ((float) (1 / (1 + (java.lang.Math.pow(java.lang.Math.E, (-temp))))));
}