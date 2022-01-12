public void closeFiles() throws java.io.IOException {
    if ((m_dataOut) != null) {
        m_dataOut.flush();
        m_dataOut.close();
    }
    if ((m_headerOut) != null) {
        m_headerOut.flush();
        m_headerOut.close();
    }
}