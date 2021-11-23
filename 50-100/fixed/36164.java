public void execute(org.camunda.bpm.engine.impl.pvm.delegate.ActivityExecution execution) throws java.lang.Exception {
    ensureConnectorInitialized();
    org.camunda.connect.spi.ConnectorRequest<?> request = connectorInstance.createRequest();
    try {
        applyInputParameters(execution, request);
        org.camunda.connect.spi.ConnectorResponse response = request.execute();
        applyOutputParameters(execution, response);
    } catch (org.camunda.bpm.engine.delegate.BpmnError bpmne) {
        propagateBpmnError(bpmne, execution);
    } catch (java.lang.Exception e) {
        propagateExceptionAsError(e, execution);
    }
    leave(execution);
}