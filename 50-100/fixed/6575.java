public void switcharoo() {
    game.items.Item itemNew = level.getItem(x, y);
    if (itemNew == null)
        return ;
    
    level.removeItem(x, y);
    game.items.Item itemOld = items[selected].item;
    if (itemOld == null)
        return ;
    
    addItem(null, selected);
    level.addItem(itemOld, x, y);
    addItem(itemNew, selected);
}