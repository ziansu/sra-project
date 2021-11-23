private void onChar(char c) {
    if (c == '"') {
        m_isInQuotes = !(m_isInQuotes);
    }else
        if (org.opennms.core.utils.StringUtils.CommandArrayGenerator.isWhitespace(c)) {
            if (!(m_isInQuotes)) {
                resetSegment();
            }else
                if (c == ' ') {
                    m_segmentBuffer.append(c);
                }else {
                    resetSegment();
                }
            
        }else {
            m_segmentBuffer.append(c);
        }
    
}