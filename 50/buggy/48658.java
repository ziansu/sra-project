@java.lang.Override
public void handleRequest(java.net.InetAddress address, request.Message acknowleged) {
    dht_node.DistributedHashTable dht = dht_node.DistributedHashTable.getIntance();
    dht.setLeft(newLeftNode);
    request.CommunicationHandler.sendMessage(new request.ACK(getRequestID()), address);
    dht.checkNeighbor();
}