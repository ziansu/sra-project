public void notifyRepaired(double time) {
    historyUpdate(time);
    if (!(hasFinishedDuringRepair())) {
        this.timeBroken = time - (timeBreakdown);
        executeJob(time);
    }else
        if (isExecuting()) {
            state = EquipletState.BUSY;
        }else {
            state = EquipletState.IDLE;
        }
    
}