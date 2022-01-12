public boolean get(int index) {
    if ((0 <= index) && (index < (m_value.length)))
        return m_value[index];
    
    return false;
}