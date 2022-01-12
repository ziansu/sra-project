@java.lang.Override
public double[] findLocalGBest(int particleNumber, int currentSwarmSize) {
    for (int i = 0; i < (bestPositions.length); i++) {
        bestFitnesses[i] = evaluateFit(bestPositions[i]);
    }
    localBestIndex = getMinPos(bestFitnesses, currentSwarmSize);
    return bestPositions[localBestIndex];
}