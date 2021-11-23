@javax.xml.bind.annotation.XmlAttribute
public byte[] getBytes() {
    byte[] retval = new byte[m_bytes.remaining()];
    m_bytes.get(retval);
    m_bytes.rewind();
    return retval;
}