private void reduceStress() {
    float cellStressLearningRate = _c.getStressLearningRate();
    for (int i = 0; i < (_cellStress._values.length); ++i) {
        _cellStress._values[i] -= (_cellStress._values[i]) * cellStressLearningRate;
    }
}