public boolean PlaceBuilding(int AreaNumber, Player player) {
    if ((player.GetBuildingCount()) != 0) {
        ListArea.get((AreaNumber - 1)).AddBuilding(player.PlaceBuilding());
        return true;
    }
    return false;
}