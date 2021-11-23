public void onUnselectCurrentRowTreeTable(org.primefaces.event.NodeUnselectEvent event) {
    if ((currentOrTarget) == (com.dbms.controller.ImpactSearchController.SELECTED_CURRENT_LIST))
        currentOrTarget = com.dbms.controller.ImpactSearchController.SELECTED_NO_LIST;
    
}