public long getFilePointer() {
    if ((m_oHeader) == null)
        return m_lngFilePointer;
    else
        return (m_lngFilePointer) + (m_oHeader.getSize());
    
}