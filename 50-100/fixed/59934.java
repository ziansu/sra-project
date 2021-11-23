@java.lang.Override
public void renewLease(java.lang.String clientName) throws java.io.IOException, org.apache.hadoop.security.AccessControlException {
    java.util.Collection<org.apache.giraffa.FileLease> leases = leaseManager.renewLease(clientName);
    if ((leases == null) || (leases.isEmpty()))
        return ;
    
    for (org.apache.giraffa.FileLease lease : leases) {
        org.apache.giraffa.INode iNode = nodeManager.getINode(lease.getPath());
        if (iNode != null) {
            iNode.setLease(lease);
            nodeManager.updateINodeLease(iNode);
        }
    }
}