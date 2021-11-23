protected void reduceUtility() {
    float cellUtilityLearningRate = _c.getUtilityLearningRate();
    for (int i = 0; i < (_cellUtility._values.length); ++i) {
        float utilityOld = _cellUtility._values[i];
        float utilityNew = utilityOld - (utilityOld * cellUtilityLearningRate);
        _cellUtility._values[i] = utilityNew;
    }
}