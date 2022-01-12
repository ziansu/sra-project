@java.lang.Override
public void generateSamples() {
    for (int p = 0; p < (numSets); p++) {
        for (int j = 0; j < (numSamples); j++) {
            squareSamples.add(new utilities.Point2D(((j + (utilities.Maths.randDouble())) / (numSamples)), ((j + (utilities.Maths.randDouble())) / (numSamples))));
        }
    }
    shuffleXCoordinates();
    shuffleYCoordinates();
}