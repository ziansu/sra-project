public void reset() {
    resetBaseDetails();
    resetProcessDetails();
    resetOrchestrationDetails();
    eventDetails.tableModel.setRowCount(0);
    orcProcessContextValue.setText("");
}