@java.lang.Override
public void generateSamples() {
    for (int p = 0; p < (numSets); p++) {
        for (int j = 0; j < (numSamples); j++) {
            squareSamples.add(new utilities.Point2D((1 / j), samplers.Hammersley.phi(j)));
        }
    }
}