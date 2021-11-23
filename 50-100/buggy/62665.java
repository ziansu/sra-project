protected void getIncidentOnClickHandler(android.view.View v) {
    isep.moodup.Incident item = ((isep.moodup.Incident) (v.getTag()));
    android.content.Intent intent = new android.content.Intent(this, isep.moodup.ViewIncident.class);
    java.lang.String idIncident = item.getId();
    intent.putExtra(Config.INCIDENT_ID, idIncident);
    startActivity(intent);
}