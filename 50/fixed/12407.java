private boolean openDoor(tiles.Door tile, character.Player p) {
    if ((p.getInven().size()) > 0) {
        tile.openDoor();
        return true;
    }
    return false;
}