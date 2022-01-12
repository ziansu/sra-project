@java.lang.Override
public void endPrefixMapping(java.lang.String prefix) {
    m_prefixMap.remove(prefix);
    if (m_inXMLMetadata) {
        m_localPrefixMap.remove(prefix);
    }
}