@java.lang.Override
public void ClearBuffer(int index) {
    if (udp) {
        m_InformationParser[(index + ((m_InformationParser.length) / 2))].clear();
    }
    m_InformationParser[index].clear();
}