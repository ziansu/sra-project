private void processTargetStateChanges(java.util.Set<java.lang.String> connectorTargetStateChanges) {
    if (!(connectorTargetStateChanges.isEmpty())) {
        for (java.lang.String connector : connectorTargetStateChanges) {
            org.apache.kafka.connect.runtime.TargetState targetState = configState.targetState(connector);
            worker.setTargetState(connector, targetState);
            if (targetState == (org.apache.kafka.connect.runtime.TargetState.STARTED))
                reconfigureConnectorTasksWithRetry(connector);
            
        }
    }
}