private double calculateGamma(int t, int i, kth.ai16.hw1.main.Matrix alpha, kth.ai16.hw1.main.Matrix beta, int[] oSeq, double diGammaDenom, int numStates) {
    double gamma = 0.0;
    for (int j = 0; j < numStates; j++) {
        gamma += calculateDiGamma(t, i, j, alpha, beta, oSeq, diGammaDenom);
    }
    return gamma;
}