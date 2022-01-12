public com.pearson.statsagg.database.alerts.Alert copyDangerMetadataFields(com.pearson.statsagg.database.alerts.Alert alertToModify) {
    if (alertToModify == null) {
        return null;
    }
    alertToModify.setIsDangerAlertActive(isDangerAlertActive_);
    alertToModify.setDangerAlertLastSentTimestamp(getDangerAlertLastSentTimestamp());
    alertToModify.setDangerActiveAlertsSet(dangerActiveAlertsSet_);
    alertToModify.setDangerFirstActiveAt(getDangerFirstActiveAt());
    return alertToModify;
}