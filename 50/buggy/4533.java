public boolean updateBestReward(double newBest, logist.topology.Topology.City newBestAction) {
    if (newBest > (bestReward)) {
        pre_bestReward = bestReward;
        bestReward = newBest;
        bestAction = newBestAction;
        return true;
    }
    return false;
}