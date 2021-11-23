public double[][] thirdOctaveFiltering(double[] signal) {
    int signalLength = signal.length;
    int nbFreqs = standardFrequencies.length;
    double[][] filteredSignals = new double[nbFreqs][signalLength];
    for (int idf = 0; idf < nbFreqs; idf++) {
        double[] filteredSignal = applySosFilter(signal, idf);
        java.lang.System.arraycopy(filteredSignal, 0, filteredSignals[idf], 0, signalLength);
    }
    return filteredSignals;
}