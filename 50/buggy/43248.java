public void PlaceBuildingInEachArea(int player) {
    for (int i = 0; i < (GameBoard.ListArea.size()); i++)
        GameBoard.PlaceBuilding(i, ListPlayer.get(player));
    
}