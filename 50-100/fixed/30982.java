public int getBestIndex(openga.chromosomes.populationI arch1) {
    int index = 0;
    double bestobj = 0;
    for (int k = 0; k < (arch1.getPopulationSize()); k++) {
        if ((arch1.getObjectiveValues(k)[0]) > bestobj) {
            bestobj = arch1.getObjectiveValues(k)[0];
            index = k;
        }
    }
    return index;
}