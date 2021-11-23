public void dispose() {
    if (m_initOk) {
        nativeDelete(m_managerPtr);
        m_managerPtr = 0;
        m_initOk = false;
    }
}