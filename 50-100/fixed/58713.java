public void notifyRepaired(double time) {
    historyUpdate(time);
    if (!(hasFinishedDuringRepair())) {
    }
    if (isExecuting()) {
        this.timeBroken = time - (timeBreakdown);
        state = EquipletState.BUSY;
    }else {
        state = EquipletState.IDLE;
    }
}