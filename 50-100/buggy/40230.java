public double episode(boolean isTrainMode, boolean activateRewardShaping, boolean activateSimilarities) {
    int iteration = 0;
    while ((!(isGoalReached())) && (iteration < 5000)) {
        update(isTrainMode, activateRewardShaping, activateSimilarities);
        iteration++;
    } 
    for (int i = 0; i < (aPredators.length); i++) {
        if (isGoalReached()) {
            aPredators[i].reward(1, isTrainMode);
        }
    }
    return iteration;
}