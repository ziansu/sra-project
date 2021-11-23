public void setLineWidth(final float fLineWidth) throws java.io.IOException {
    if (fLineWidth >= 0)
        if (!(com.helger.commons.equals.EqualsHelper.equals(m_fLastUsedLineWidth, fLineWidth))) {
            m_aStream.setLineWidth(fLineWidth);
            m_fLastUsedLineWidth = fLineWidth;
        }
    
}