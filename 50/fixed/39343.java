public org.camunda.bpm.engine.runtime.CaseInstance create(java.lang.String businessKey) {
    org.camunda.bpm.engine.runtime.CaseInstance caseInstance = caseService.createCaseInstanceByKey(ShipmentCaseConstants.SHIPMENTCASEKEY, businessKey);
    return caseInstance;
}