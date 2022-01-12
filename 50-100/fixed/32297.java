@java.lang.Override
public void setSelectedItem(java.lang.Object object) {
    super.setSelectedItem(object);
    selectedBatchResultEntry = ((batch.BatchResultEntry) (getSelectedItem()));
    if ((selectedBatchResultEntry.getCa()[0]) != null) {
        fillAssignmentTypeList(selectedBatchResultEntry.getCa()[0].getAssignmentTypes());
        setMultipleCycleCAStatistic(selectedBatchResultEntry.getMultipleCycleCAStatistics());
        setCellularAutomaton(selectedBatchResultEntry.getCa()[0]);
        currentAverageStepsPerSeconds = selectedBatchResultEntry.getAverageCAStepsPerSecond();
    }else
        gui.JEditor.sendMessage("This entry bears no cellular automaton results!");
    
}