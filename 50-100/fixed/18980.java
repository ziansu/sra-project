public void process(java.lang.String RECIEVED_IP, int RECIEVED_PORT) throws java.io.IOException {
    int clusterID;
    clusterID = lk.filetributed.util.Utils.getClusterID(RECIEVED_IP, RECIEVED_PORT, lk.filetributed.client.Client.NO_CLUSTERS);
    getIpTable().addTableEntry(new lk.filetributed.client.TableEntry(RECIEVED_IP, (RECIEVED_PORT + ""), (clusterID + "")));
    sendJoinMessage(RECIEVED_IP, RECIEVED_PORT);
    sentJoins.add(new lk.filetributed.client.TableEntry("0.0.0.0", "0000", "0"));
}