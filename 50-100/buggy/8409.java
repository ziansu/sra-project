public void makeSchedule() {
    symposium.DummyScheduler.DetermineDifficulty.setDifficulties();
    java.util.List<symposium.Panel> pnlCollection = symposium.ScheduleData.instance().getFreePanels();
    while ((pnlCollection.size()) > 0) {
        this.schedule(pnlCollection.get(0));
    } 
    setAssignedPanelsMessages();
}