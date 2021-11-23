protected void putAttributes(final org.apache.hadoop.io.MapWritable attributes) throws java.io.IOException {
    final int len = m_dbfReader.getNumberOfFields();
    if (len > 0) {
        m_dbfReader.nextDataType();
        for (int i = 0; i < len; i++) {
            attributes.put(m_keys.get(i), m_dbfReader.readFieldWritable(i));
        }
    }
}