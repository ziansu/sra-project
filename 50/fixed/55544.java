public void close() throws java.io.IOException {
    if (null != (m_is)) {
        m_is.close();
        m_is = null;
    }
}