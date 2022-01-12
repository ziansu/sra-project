private void ensureConnection() throws java.sql.SQLException {
    boolean bclosed;
    try {
        bclosed = ((m_c) == null) || (m_c.isClosed());
    } catch (java.sql.SQLException e) {
        bclosed = true;
    }
    if (bclosed) {
        try {
            connect();
        } catch (java.sql.SQLException e) {
            if (((m_c) == null) || (m_c.isClosed())) {
                connect();
            }
        }
    }
}