@java.lang.Override
public int numberOfFloodedPositions(java.util.Set<java.lang.Integer> floodedPositios, int initialNumberOfFloodedPositions, int depthInTree) {
    int numberOfFloodedPositions = floodedPositios.size();
    for (int powerpill : getRemainingPowerPillsIndices()) {
        if (floodedPositios.contains(powerpill)) {
            numberOfFloodedPositions += 40;
        }
    }
    numberOfFloodedPositions = initialNumberOfFloodedPositions + ((numberOfFloodedPositions - initialNumberOfFloodedPositions) / depthInTree);
    return numberOfFloodedPositions;
}