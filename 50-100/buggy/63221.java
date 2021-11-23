public void reset(int resultCount, int pageSize, boolean fireChanged) {
    m_lastPage = resultCount / pageSize;
    m_resultCount = resultCount;
    m_pageSize = pageSize;
    setPage(0, false);
    updateButtons();
    if (fireChanged) {
        firePageChanged(0);
    }
}