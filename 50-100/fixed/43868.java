public boolean PlaceBuilding(int AreaNumber, Player player) {
    if ((player.GetBuildingCount()) != 0) {
        return ListArea.get((AreaNumber - 1)).AddBuilding(player.PlaceBuilding());
    }
    return false;
}