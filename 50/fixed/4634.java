private void set() {
    if ((m_nodeId[0]) != (-1)) {
        m_engine.sqrSet(m_freq, m_amp, ((m_add) - 1), m_pos, m_nodeId);
    }
}