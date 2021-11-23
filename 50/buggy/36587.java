public void onSelectCurrentRowTreeTable(org.primefaces.event.NodeSelectEvent event) {
    setReviewEnabled(false);
    setApproveEnabled(false);
    setDemoteEnabled(false);
    currentOrTarget = com.dbms.controller.ImpactSearchController.SELECTED_CURRENT_LIST;
}