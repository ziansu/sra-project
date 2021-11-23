public void SetAreaId(short id) {
    if (!((AreaIdMissing()) && (id >= 1))) {
        throw new java.lang.IllegalStateException();
    }
    m_areaId = id;
}