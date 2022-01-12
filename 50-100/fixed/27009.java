void playerChanged() {
    update();
    game.Player player = game.getCurrentPlayer();
    game.CatalogItem lastItem = lastSelection.get(player);
    if ((player.getInventory().get(lastItem.getId())) == 0)
        lastItem = catalog.get("simple_bomb");
    
    itemSelected(lastItem);
}