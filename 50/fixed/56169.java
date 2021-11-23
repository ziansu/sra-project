private void removePeer(java.lang.String id) {
    fr.pchab.webrtcclient.WebRtcClient.Peer peer = peers.get(id);
    mListener.onRemoveRemoteStream(peer.endPoint);
}