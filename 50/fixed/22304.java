public ru.ifmo.geoquiz.model.Stage getCurStage() {
    if ((curStageIndex) < 0) {
        return null;
    }
    return this.stages[curStageIndex];
}