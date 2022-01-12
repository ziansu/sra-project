public void set(int index, boolean v) {
    if (index < 0)
        throw new java.lang.IllegalArgumentException("index < 0");
    
    if (index >= (m_value.length))
        resize((index + 1));
    
    m_value[index] = v;
    m_has_value[index] = true;
}