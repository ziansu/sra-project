private void populateGameItems(model.GameItem[] items) {
    for (model.GameItem item : items)
        board.placeGameItem(item);
    
}