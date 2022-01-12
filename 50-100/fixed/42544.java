@java.lang.Override
public void generateSamples() {
    for (int p = 0; p < (numSets); p++) {
        for (int j = 0; j < (numSamples); j++) {
            squareSamples.add(new utilities.Point2D((((double) (j)) / (numSamples)), samplers.Hammersley.phi(j)));
        }
    }
}