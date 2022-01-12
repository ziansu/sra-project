private void setSelectedLikeFor(int selected) {
    for (int i = 0; i < selected; i++)
        setUnselectedEmoji(i);
    
    for (int i = selected + 1; i < (config.emojis.size()); i++)
        setUnselectedEmoji(i);
    
    setSelectedEmoji(selected);
}