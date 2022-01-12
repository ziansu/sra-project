public synchronized boolean containsUrlInAnalyzedNonInternalLinksList(java.lang.String i_Url) {
    boolean res = false;
    if (m_AnalyzedNonInternalLinks.contains(i_Url)) {
        res = true;
    }
    return res;
}