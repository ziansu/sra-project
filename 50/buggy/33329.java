public void SetBlocked() {
    if (AreaIdMissing()) {
        throw new java.lang.IllegalStateException("AreaIdMissing()");
    }
    m_areaId = bwem.MiniTile.blockingCP;
}