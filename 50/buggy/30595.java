@java.lang.Override
public void run() {
    for (int workID = 0; workID < (this.taskSize); workID++) {
        this.satisfiedPositionRecordThread.processSatisfiedPositionRecord(this.internalEventID, workUnits[workID]);
    }
}