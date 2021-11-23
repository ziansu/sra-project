boolean openTile(Player player) {
    if ((structOnTile) == null) {
        return true;
    }
    if ((structOnTile.getPlayer()) != player) {
        return false;
    }
    for (Unit unit : getUnitsOnTile()) {
        if ((unit.getPlayer()) != player) {
            return false;
        }else {
            return true;
        }
    }
    return true;
}