public long getFilePointer() {
    return (m_lngFilePointer) + (m_oHeader.getSize());
}