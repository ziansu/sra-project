private void populateGameItems(model.GameItem[] items) {
    for (int i = 0; i < (items.length); i++)
        board.placeGameItem(items[i]);
    
}