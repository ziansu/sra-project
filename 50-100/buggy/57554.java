public org.tierlon.dxref.data.DataNode convertToDataNode(java.lang.Class<? extends org.tierlon.dxref.data.DataNode> dataNodeClass, org.neo4j.rest.graphdb.entity.RestNode restNode) {
    org.tierlon.dxref.data.DataNode result = null;
    try {
        result = provideNewInstance(dataNodeClass, restNode);
    } catch (java.lang.Exception e) {
        org.tierlon.dxref.data.repository2.support.node.DataNodeAdapter.log.error((("Unable to create instance of class: " + dataNodeClass) + "    DOES IT HAVE A PUBLIC EMPTY CONSTRUCTOR!?"), e);
        return null;
    }
    instrumentDataNode(result, restNode);
    org.tierlon.dxref.data.repository2.support.node.DataNodeAdapter.pmAdapter.setPropertyDataFromRestNode(result.getPropertyMap(), restNode);
    return result;
}