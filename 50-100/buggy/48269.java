public void setPrimary(java.lang.String primary) {
    if (((m_primary) != null) && (m_primary.equals(primary)))
        return ;
    
    if ((m_primary) != null) {
        m_interfToDel.add(m_primary);
    }
    if (primary != null) {
        m_interfToAdd.add(primary);
    }
    m_primary = primary;
}