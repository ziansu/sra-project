public synchronized void setPeerHavePiece(com.jtorrent.peer.Peer peer, int index, boolean have) {
    updatePieceFrequency(index, have);
    java.util.BitSet pieceSet = _peerBitSetMap.get(peer.getHexPeerID());
    pieceSet.set(index);
    _peerBitSetMap.put(peer.getHexPeerID(), pieceSet);
}