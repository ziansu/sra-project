public float activated(float[] inputs) {
    int temp = 0;
    for (int i = 0; i < (inputs.length); i++) {
        temp += (inputs[i]) * (weights[i]);
    }
    if (temp >= (weights[((weights.length) - 1)]))
        return 1;
    
    return 0;
}