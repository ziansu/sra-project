private void closeOpenAlerts(com.ifountain.opsgenie.client.OpsGenieClient client, java.lang.String apiKey, com.seyren.core.domain.Check check) throws com.ifountain.opsgenie.client.OpsGenieClientException, java.io.IOException, java.text.ParseException {
    java.util.List<com.seyren.core.domain.Alert> opsAlerts = getOpenAlerts(client, apiKey, check);
    for (com.seyren.core.domain.Alert alert : opsAlerts) {
        closeAlert(alert, client, apiKey, check);
    }
}