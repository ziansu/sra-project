@java.lang.Override
public void processDone(java.lang.String processCommand) {
    super.processDone(processCommand);
    org.geppetto.core.externalprocesses.ExternalProcess process = this.getExternalProccesses().get(processCommand);
}