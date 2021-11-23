public void SetAreaId(short id) {
    if ((AreaIdMissing()) && (id >= 1)) {
        throw new java.lang.IllegalStateException("AreaIdMissing() && (id >= 1)");
    }
    m_areaId = id;
}