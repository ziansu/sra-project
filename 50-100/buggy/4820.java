private void addR2VEdgeWithoutSaving(java.lang.Long ccmId, java.lang.Long icmId, java.lang.String edgePort, java.lang.String edgeName, net.stigmod.service.RelationNode relationNode, java.lang.String valueName, java.util.Map<java.lang.String, net.stigmod.service.ValueNode> valueNodePool) {
    net.stigmod.service.ValueNode valueNode = getValueNodeByNameWithoutSaving(ccmId, icmId, valueName, valueNodePool);
    net.stigmod.service.RelationToValueEdge r2vEdge = new net.stigmod.service.RelationToValueEdge(ccmId, icmId, edgePort, edgeName, relationNode, valueNode);
    relationNode.addR2VEdge(r2vEdge);
    valueNode.addR2VEdge(r2vEdge);
}