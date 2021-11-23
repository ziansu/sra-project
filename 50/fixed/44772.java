public java.util.List<ralgorithm.State> determineNextStates() {
    ralgorithm.ParallelMove pm = determinePMove();
    java.util.List<ralgorithm.State> res = pm.pmove();
    return res;
}