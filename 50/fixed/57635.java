public void loadOverview() {
    IncidentHolder.setIncident(lvIncidenten.getSelectionModel().getSelectedItem());
    StageController.loadStage(View.overviewScene, IncidentHolder.getIncident().getDescription());
}