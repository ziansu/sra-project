public void execute(org.camunda.bpm.model.bpmn.BpmnModelInstance modelInstance) {
    java.lang.Process process = org.prisma.processhub.bpmn.manipulation.util.BpmnElementSearcher.findFirstProcess(modelInstance);
    org.prisma.processhub.bpmn.manipulation.util.BpmnHelper.checkInvalidArgument(baseProcessId.equals(process.getId()), "Can't extend process in modelInstance. Process id doesn't match baseProcessId");
    process.setId(newProcessId);
}