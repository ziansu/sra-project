public void process(java.lang.String RECIEVED_IP, int RECIEVED_PORT) throws java.io.IOException {
    int clusterID;
    clusterID = lk.filetributed.util.Utils.getClusterID(RECIEVED_IP, RECIEVED_PORT, lk.filetributed.client.Client.NO_CLUSTERS);
    lk.filetributed.model.Node node = new lk.filetributed.model.Node(RECIEVED_IP, RECIEVED_PORT, lk.filetributed.client.Client.NO_CLUSTERS);
    sendJoinMessage(RECIEVED_IP, RECIEVED_PORT);
}