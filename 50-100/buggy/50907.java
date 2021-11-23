@cucumber.api.java.en.When(value = "^I update maintenance state, message: \"([^\"]*)\" percent: (\\d+)$")
public void updateState(java.lang.String message, java.lang.Float percent) throws java.lang.Throwable {
    org.alien4cloud.server.MaintenanceUpdateDTO updateDTO = new org.alien4cloud.server.MaintenanceUpdateDTO(message, percent);
    alien4cloud.it.Context.getInstance().registerRestResponse(alien4cloud.it.Context.getRestClientInstance().putJSon("/rest/v1/maintenance", alien4cloud.it.Context.getJsonMapper().writeValueAsString(updateDTO)));
}