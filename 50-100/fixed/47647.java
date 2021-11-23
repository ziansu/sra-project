public void sendMessage(pt.ulisboa.tecnico.amorphous.internal.cluster.messages.IAmorphClusterMessage msg) throws pt.ulisboa.tecnico.amorphous.internal.cluster.messages.InvalidAmorphClusterMessageException {
    try {
        this.outMcastSocket.sendMessage(new pt.ulisboa.tecnico.amorphous.internal.cluster.ipv4.Packet(this.mcastGroup, pt.ulisboa.tecnico.amorphous.internal.cluster.ipv4.MessageCodec.getEncodedMessage(msg)));
    } catch (pt.ulisboa.tecnico.amorphous.internal.cluster.ipv4.MessageTooLargeException e) {
        pt.ulisboa.tecnico.amorphous.internal.cluster.ipv4.ClusterCommunicator.logger.error(e.getMessage());
    }
}