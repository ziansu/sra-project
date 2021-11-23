public void serialize(java.nio.ByteBuffer buff) {
    assert (buff.remaining()) >= (getSerializedSize());
    buff.putLong(m_lastAckedDrId);
    buff.putLong(m_lastSpUniqueId);
    buff.putLong(m_lastMpUniqueId);
    buff.putInt(m_map.size());
    for (java.util.Map.Entry<java.lang.Long, java.lang.Long> entry : m_map.entrySet()) {
        buff.putLong(entry.getKey());
        buff.putLong(entry.getValue());
    }
}