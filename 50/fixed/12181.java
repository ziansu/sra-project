public void onUnselectTargetRowTreeTable(org.primefaces.event.NodeUnselectEvent event) {
    if ((currentOrTarget) == (com.dbms.controller.ImpactSearchController.SELECTED_TARGET_LIST))
        currentOrTarget = com.dbms.controller.ImpactSearchController.SELECTED_NO_LIST;
    
}