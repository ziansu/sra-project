public void onUnselectTargetRowTreeTable(org.primefaces.event.NodeUnselectEvent event) {
    setReviewEnabled(false);
    setApproveEnabled(false);
    setDemoteEnabled(false);
    if ((currentOrTarget) == (com.dbms.controller.ImpactSearchController.SELECTED_TARGET_LIST))
        currentOrTarget = com.dbms.controller.ImpactSearchController.SELECTED_NO_LIST;
    
    setExportEnabled(false);
}