public void updateWeights(double rate) {
    for (int i = 0; i < (weights.length); i++) {
        double deltaW = (((-1) * rate) * (connections[i].delta)) * (Output);
        weights[i] += deltaW;
    }
}