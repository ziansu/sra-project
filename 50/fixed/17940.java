public hf.game.items.FavorToken getFavorTokenByIndex(int index) {
    if ((m_FavorTokenCollection.size()) == 0)
        return null;
    
    return m_FavorTokenCollection.get(index);
}