private void runNode(fr.irisa.diverse.Flow.Node node) {
    if (node.isRunning()) {
        owningWorkspace.stopNode(node);
    }
    fr.irisa.diverse.Core.NodeExecutionThread t = new fr.irisa.diverse.Core.NodeExecutionThread(node, this, owningWorkspace);
    running.add(t);
    t.start();
    owningWorkspace.clientCommunicationManager.sendStartNode(node.getId());
}