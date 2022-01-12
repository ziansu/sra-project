public double computeNormalizationFactor(int[][] part1, int[][] part2) {
    infodynamics.measures.discrete.EntropyCalculatorDiscrete ecd = new infodynamics.measures.discrete.EntropyCalculatorDiscrete(base);
    ecd.initialise();
    ecd.addObservations(part1);
    double entropy1 = ecd.computeAverageLocalOfObservations();
    ecd.initialise();
    ecd.addObservations(part2);
    double entropy2 = ecd.computeAverageLocalOfObservations();
    double rvalue = java.lang.Math.min(entropy1, entropy2);
    return rvalue == 0 ? 1 : rvalue;
}