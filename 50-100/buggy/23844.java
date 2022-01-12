public boolean moveWest(byui.cit260.strangerthings.model.Game game) {
    byui.cit260.strangerthings.model.Player player = game.getPlayer();
    byui.cit260.strangerthings.model.Location currentLocation = player.getLocation();
    byui.cit260.strangerthings.model.Map map = game.getMap();
    if ((currentLocation.getColumn()) == 0) {
        return false;
    }
    player.setLocation(map.getLocation(currentLocation.getRow(), ((currentLocation.getColumn()) - 1)));
    return true;
}