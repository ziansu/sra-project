@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if ((requestCode == (us.dexon.dexonbpm.activity.IncidentsActivity.FILTER_INCIDENT_CODE)) && (data != null)) {
        java.lang.String filterText = data.getStringExtra("CurrentFilter");
        boolean filterClose = data.getBooleanExtra("IncludeClose", false);
        this.currentTicketFilter = us.dexon.dexonbpm.infrastructure.enums.TicketFilter.GetValue(filterText);
        asignados_btn.setText(filterText);
        this.includeClose = filterClose;
        this.executeSearch(null);
    }
}