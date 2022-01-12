public static void createNewGame(largeandspacious.model.Player player) {
    largeandspacious.model.Game game = new largeandspacious.model.Game();
    largeandspacious.LargeAndSpacious.setCurrentGame(game);
    game.setPlayer(player);
    largeandspacious.model.Item[] inventoryList = largeandspacious.control.GameControl.createInventoryList();
    game.setInventory(inventoryList);
    largeandspacious.model.Map map = largeandspacious.control.MapControl.createMap();
    game.setMap(map);
    largeandspacious.control.MapControl.moveActorsToStartingLocation(map);
}