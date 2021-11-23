public void setState(final short p_nodeID, final de.hhu.bsinfo.dxram.lookup.overlay.storage.PeerState p_state) {
    m_peerHandlers[(p_nodeID & 65535)].setState(p_state);
}