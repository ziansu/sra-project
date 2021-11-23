public void registeListener(java.lang.String node, cn.edu.sjtu.se.dclab.service_management.DataListener dataListener, cn.edu.sjtu.se.dclab.service_management.NodeListener nodeListener) {
    java.lang.String path = getPath(node);
    if (client.exists(path))
        throw new java.lang.RuntimeException("the node existed!");
    
    if (dataListener != null)
        client.subscribeDataChanges(path, dataListener);
    
    if (nodeListener != null)
        client.subscribeChildChanges(path, nodeListener);
    
}