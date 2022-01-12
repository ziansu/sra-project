public void switcharoo() {
    game.items.Item itemNew = level.getItem(x, y);
    if (itemNew == null)
        return ;
    
    level.removeItem(x, y);
    game.items.Item itemOld = items[selected];
    if (itemOld == null)
        return ;
    
    items[selected] = null;
    level.addItem(itemOld, x, y);
    items[selected] = itemNew;
}