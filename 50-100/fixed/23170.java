public org.ndexbio.model.object.network.NetworkSummary updateNetwork() throws java.util.concurrent.ExecutionException, org.ndexbio.common.exceptions.NdexException {
    try {
        updateNetworkNode();
        cloneNetworkElements();
        this.networkDoc.reload();
        this.networkDoc.field(NdexClasses.Network_P_isComplete, true);
        return this.network;
    } finally {
        this.localConnection.commit();
    }
}