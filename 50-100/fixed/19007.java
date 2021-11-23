void trackStage(final net.sf.openrocket.rocketcomponent.AxialStage newStage) {
    int stageNumber = newStage.getStageNumber();
    net.sf.openrocket.rocketcomponent.AxialStage value = stageMap.get(stageNumber);
    if (newStage.equals(value)) {
        if (newStage != value) {
            stageMap.put(stageNumber, newStage);
        }
        return ;
    }else {
        stageNumber = getNewStageNumber();
        newStage.setStageNumber(stageNumber);
        this.stageMap.put(stageNumber, newStage);
    }
}