public void startTopologyService(java.lang.String address, cartago.WorkspaceId wId, cartago.NodeId nId) throws cartago.infrastructure.CartagoInfrastructureLayerException {
    if ((service) != null) {
        throw new cartago.infrastructure.CartagoInfrastructureLayerException();
    }
    try {
        cartago.topology.WorkspaceTree tree = new cartago.topology.WorkspaceTree();
        service = new cartago.infrastructure.rmi.topology.CartagoTreeRemote(tree);
        service.installTree(address, wId, nId);
        syncTrees(tree, false, "");
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        throw new cartago.infrastructure.CartagoInfrastructureLayerException();
    }
}