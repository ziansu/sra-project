public void loadIncidentWijzigen() {
    IncidentHolder.setIncident(lvIncidenten.getSelectionModel().getSelectedItem());
    StageController.loadStage(View.incident, "Incident wijzigen");
}