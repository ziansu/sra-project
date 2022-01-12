public void writeToStream(java.io.DataOutput out) throws java.io.IOException {
    if (((m_name) != null) && (!(m_name.isEmpty()))) {
        out.writeShort(m_name.length());
        out.write(m_name.getBytes());
    }
}