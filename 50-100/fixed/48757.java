@java.lang.Override
public void createDeployment(java.lang.String processArchiveName, org.camunda.bpm.engine.repository.DeploymentBuilder deploymentBuilder) {
    org.camunda.bpm.model.bpmn.BpmnModelInstance bpmnModelInstance = org.camunda.bpm.model.bpmn.Bpmn.createExecutableProcess("foo").startEvent().serviceTask().camundaExpression("${myBean}").endEvent().done();
    deploymentBuilder.addModelInstance("process.bpmn", bpmnModelInstance);
}