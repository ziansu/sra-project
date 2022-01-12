@java.lang.Override
public void simulate() {
    deployProtocol.reset();
    gradualDeploymentDataCollector.clear();
    nodesSelector.reset();
    new addons.protocolchangers.PeriodicProtocolChanger(engine, state, deployPeriod) {
        @java.lang.Override
        public void onTimeToChange() {
            java.util.Collection<network.Node> selectedNodes = nodesSelector.selectNodes(deployedNodeCount);
            for (network.Node selectedNode : selectedNodes) {
                changeProtocol(selectedNode, deployProtocol);
                gradualDeploymentDataCollector.setNodeDeployed(selectedNode);
            }
        }
    };
    super.simulate();
}