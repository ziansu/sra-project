public void resizeUDFBuffer(int size) {
    m_udfBuffer.clear();
    assert (m_udfBuffer) != null;
    if (size > (m_udfBuffer.capacity())) {
        setupUDFBuffer(size);
        updateEEBufferPointers();
    }
}