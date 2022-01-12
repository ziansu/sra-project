public java.lang.Object getItem(int position) {
    if ((position == 0) || (position == ((m_favorite.size()) + 1)))
        return null;
    
    if (position <= (m_favorite.size()))
        return m_favorite.get((position - 1));
    
    return m_recent.get(((position - (m_favorite.size())) - 2));
}