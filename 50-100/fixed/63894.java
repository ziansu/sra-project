public static void createNewGame(byui.cit260.escapeHashashin.model.Player player) {
    byui.cit260.escapeHashashin.model.Game game = new byui.cit260.escapeHashashin.model.Game();
    escapehashashin.EscapeHashashin.setCurrentGame(game);
    game.setPlayer(player);
    byui.cit260.escapeHashashin.model.Item[] inventoryList = byui.cit260.escapeHashashin.control.GameControl.createInventoryList();
    game.setItems(inventoryList);
    byui.cit260.escapeHashashin.model.Map map = byui.cit260.escapeHashashin.control.MapControl.createMap();
    game.setMap(map);
}