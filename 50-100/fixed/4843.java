public void stateChanged(org.apache.zookeeper.server.quorum.QuorumStateListener.State state, org.apache.zookeeper.server.quorum.QuorumPeer peer) {
    if (((stateListeners) != null) && (!(stateListeners.isEmpty()))) {
        org.apache.zookeeper.server.quorum.QuorumStateHelper.Message message = new org.apache.zookeeper.server.quorum.QuorumStateHelper.Message(state, peer);
        messages.offer(message);
    }
}