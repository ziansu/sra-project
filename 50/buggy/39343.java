public org.camunda.bpm.engine.runtime.CaseInstance create() {
    java.lang.String businessKey = java.util.UUID.randomUUID().toString();
    org.camunda.bpm.engine.runtime.CaseInstance caseInstance = caseService.createCaseInstanceByKey(ShipmentCaseConstants.SHIPMENTCASEKEY, businessKey);
    return caseInstance;
}