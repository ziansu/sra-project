private void writeData(byte[] buf) throws java.io.IOException {
    m_device.write(buf, buf.length);
}