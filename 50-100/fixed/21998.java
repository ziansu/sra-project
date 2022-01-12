private int selectNumberOfTrips(java.lang.Integer[] tripFrequencies) {
    double[] probabilities = new double[tripFrequencies.length];
    for (int i = 0; i < (tripFrequencies.length); i++) {
        probabilities[i] = ((double) (tripFrequencies[i]));
    }
    return de.tum.bgu.msm.MitoUtil.select(probabilities);
}