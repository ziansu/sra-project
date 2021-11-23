public void learn(double reward) {
    if (reward == 1.0) {
        epsilonChooseRandomTask *= 1.0 - (1.0 / ((double) (this.numNeighborhoods)));
    }
    pTable.update(curJob.getTask().getNeighborhood().getId(), 0, reward);
    pTable.oneUpdate(oneUpdateGamma);
    tTable.update(0, 0, getNumTimeStepsWorking());
}