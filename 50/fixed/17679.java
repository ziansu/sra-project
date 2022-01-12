public void PlaceTrollInEachArea(int player) {
    for (int i = 1; i <= (GameBoard.ListArea.size()); i++)
        GameBoard.PlaceTroll(i);
    
}