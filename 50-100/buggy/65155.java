private void updateFitnessParameters() {
    updateSegmentFitnessValues();
    this.deviationFitness = 0;
    this.edgeFitness = 0;
    this.connectivityFitness = 0;
    this.fitnessValue = 0;
    for (double[] segmentFitness : segmentFitnessValues) {
        deviationFitness += segmentFitness[0];
        edgeFitness += segmentFitness[1];
        connectivityFitness += segmentFitness[2];
    }
}