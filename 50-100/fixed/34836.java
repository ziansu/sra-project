private void reduceUtility() {
    float cellUtilityLearningRate = _c.getUtilityLearningRate();
    for (int i = 0; i < (_cellUtility._values.length); ++i) {
        _cellUtility._values[i] -= (_cellUtility._values[i]) * cellUtilityLearningRate;
    }
}