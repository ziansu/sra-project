private void findGBest() {
    for (int i = 0; i < (currentSwarmSize); i++) {
        bestFitnesses[i] = evaluateFit(bestPositions[i]);
    }
    globalBestIndex = getMinPos(bestFitnesses, currentSwarmSize);
}