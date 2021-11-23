@java.lang.Override
public void calcFitness() {
    calcFitnessWithHyperPlanes(trainingData);
    fitness = ((double) (nCorrect)) / ((double) (sampleCount));
}