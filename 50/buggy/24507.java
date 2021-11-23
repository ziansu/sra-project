public void loadIncidentWijzigen() {
    IncidentHolder.setIncident(lvIncidenten.getSelectionModel().getSelectedItem().getDescription());
    StageController.loadStage(View.incident, "Incident wijzigen");
}