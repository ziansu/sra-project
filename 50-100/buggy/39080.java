private void selectedLQI() {
    int rowIndex = getTable().getSelectedRow();
    if (rowIndex >= 0) {
        com.vistatec.ocelot.its.ITSMetadata selected = ((com.vistatec.ocelot.its.LanguageQualityIssueTableView.LQITableModel) (getTableModel())).getRow(rowIndex);
        getEventBus().post(new com.vistatec.ocelot.events.LQISelectionEvent(((com.vistatec.ocelot.its.LanguageQualityIssue) (selected))));
    }
}