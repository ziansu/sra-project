public int getBestIndex(openga.chromosomes.populationI arch1) {
    int index = 0;
    double bestobj = java.lang.Double.MAX_VALUE;
    for (int k = 0; k < (arch1.getPopulationSize()); k++) {
        if (bestobj > (arch1.getObjectiveValues(k)[0])) {
            bestobj = arch1.getObjectiveValues(k)[0];
            index = k;
        }
    }
    return index;
}