public void pushAllDataToCloudant() {
    alertsModel().startPushReplication();
    childsModel().startPushReplication();
    eligibleCouplesModel().startPushReplication();
    formDataModel().startPushReplication();
    formsVersionsModel().startPushReplication();
    mothersModel().startPushReplication();
    serviceProvidedModel().startPushReplication();
    timelineEventsModel().startPushReplication();
    reportsModel().startPushReplication();
}