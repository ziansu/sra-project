public double[][] thirdOctaveFiltering(double[] signal) {
    int signalLength = signal.length;
    int nbFreqs = standardFrequencies.length;
    double[][] filteredSignals = new double[nbFreqs][signalLength];
    for (int idf = 0; idf < nbFreqs; idf++) {
        filteredSignals[idf] = applySosFilter(signal, idf);
    }
    return filteredSignals;
}