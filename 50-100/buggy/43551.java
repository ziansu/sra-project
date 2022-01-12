private double calculateGamma(int t, int i, kth.ai16.hw1.main.Matrix alpha, kth.ai16.hw1.main.Matrix beta, int[] oSeq, double diGammaDenom, int numStates) {
    double gamma = 0.0;
    for (int k = 0; k < numStates; k++) {
        gamma += calculateDiGamma(t, i, k, alpha, beta, oSeq, diGammaDenom);
    }
    return gamma;
}