public boolean dropItem(escape.gameworld.Player p) {
    if ((p.getRoom()) == null) {
        return false;
    }
    p.getRoom().getBin().add(selectedInventory);
    p.getItems().remove(selectedInventory);
    selectedInventory = null;
    return true;
}