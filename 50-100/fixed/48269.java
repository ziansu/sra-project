public void setPrimary(java.lang.String primary) {
    if (((m_primary) != null) && (m_primary.equals(primary)))
        return ;
    
    if ((m_primary) != null)
        m_interfToDel.add(new java.lang.String(m_primary));
    
    m_interfToAdd.add(new java.lang.String(primary));
    m_primary = primary;
}