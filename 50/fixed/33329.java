public void SetBlocked() {
    if (!(AreaIdMissing())) {
        throw new java.lang.IllegalStateException();
    }
    m_areaId = bwem.MiniTile.blockingCP;
}