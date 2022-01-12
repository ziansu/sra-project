public void ReplaceAreaId(short id) {
    if (!((((m_areaId) > 0) && ((id >= 1) || (id <= (-2)))) && (id != (m_areaId)))) {
        throw new java.lang.IllegalStateException();
    }
    m_areaId = id;
}