@java.lang.Override
public void calcFitness() {
    calcFitnessWithHyperPlanes();
    fitness = ((double) (nCorrect)) / ((double) (sampleCount));
}