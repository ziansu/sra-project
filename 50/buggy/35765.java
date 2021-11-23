public void onSelectTargetRowTreeTable(org.primefaces.event.NodeSelectEvent event) {
    if (this.isImpactedCmqSelected) {
        updateWorkflowButtonStates(this.selectedImpactedCmqList);
    }else
        if (this.isNonImpactedCmqSelected) {
            updateWorkflowButtonStates(this.selectedNotImpactedCmqList);
        }
    
    setExportEnabled(true);
    currentOrTarget = com.dbms.controller.ImpactSearchController.SELECTED_TARGET_LIST;
}