public double alphaCalc(com.samvbeckmann.machinelearning.reinforcement.simulation.Board state, int action) {
    return 1 / (getCorrectInfoPair(state, action).timesVisited);
}