public void ReplaceBlockedAreaId(short id) {
    if (!(((m_areaId) == (bwem.MiniTile.blockingCP)) && (id >= 1))) {
        throw new java.lang.IllegalStateException();
    }
    m_areaId = id;
}