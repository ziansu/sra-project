private void improveVector(int numAdjustments, int numGamesToPlay) {
    int currWeightIndex = 0;
    for (int i = 0; i < numAdjustments; i++) {
        weightVector[currWeightIndex] += adjustments[currWeightIndex];
        double currAvgScore = playGames(numGamesToPlay);
        if (currAvgScore > (maxAvgScore)) {
            maxAvgScore = currAvgScore;
        }else {
            weightVector[currWeightIndex] -= adjustments[currWeightIndex];
        }
        currWeightIndex = (currWeightIndex + 1) % (PlayerSkeleton.VECTOR_SIZE);
    }
}