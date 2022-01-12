public int size() {
    int i = (m_iTailPos) - (m_iHeadPos);
    if (i < 0)
        return (m_abBytes.length) + i;
    else
        return i;
    
}