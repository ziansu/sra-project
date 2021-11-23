@java.lang.Override
public io.subutai.common.peer.Peer call() throws java.lang.Exception {
    peerPekPubKeys.put(peer, peer.createPeerEnvironmentKeyPair(environment.getEnvironmentId()).getKey());
    return peer;
}