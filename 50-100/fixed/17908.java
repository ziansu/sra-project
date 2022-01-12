public void up() {
    int idx = java.lang.Math.min(((m_selectionIdx) + 1), ((m_history.length()) - 1));
    if (idx == (-1)) {
        return ;
    }
    if ((m_selectionIdx) == (-1)) {
        m_currentCache = getCurrentInputLine();
    }
    m_selectionIdx = idx;
    java.lang.String sel = m_history.get(idx);
    setCurrentInputLine(sel);
}