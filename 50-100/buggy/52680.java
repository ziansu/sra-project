private void closeOpenAlerts(com.ifountain.opsgenie.client.OpsGenieClient client, java.lang.String apiKey, com.seyren.core.domain.Check check) throws com.ifountain.opsgenie.client.OpsGenieClientException, java.io.IOException, java.text.ParseException {
    java.util.List<com.seyren.core.domain.Alert> opsAlerts = getOpenAlerts(client, apiKey, check);
    for (com.seyren.core.domain.Alert alert : opsAlerts) {
        com.ifountain.opsgenie.client.model.alert.CloseAlertRequest request = new com.ifountain.opsgenie.client.model.alert.CloseAlertRequest();
        request.setId(alert.getId());
        request.setApiKey(apiKey);
        com.ifountain.opsgenie.client.model.alert.CloseAlertResponse response = client.alert().closeAlert(request);
        assert response.isSuccess();
    }
}