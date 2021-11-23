@java.lang.Override
public void endPrefixMapping(java.lang.String prefix) {
    m_prefixMap.removeNamespace(prefix);
    if (m_inXMLMetadata) {
        m_localPrefixMap.removeNamespace(prefix);
    }
}