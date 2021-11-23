public void reduceStress() {
    float cellStressLearningRate = _c.getStressLearningRate();
    for (int i = 0; i < (_cellStress._values.length); ++i) {
        float stressOld = _cellStress._values[i];
        float stressNew = stressOld - (stressOld * cellStressLearningRate);
        _cellStress._values[i] = stressNew;
    }
}