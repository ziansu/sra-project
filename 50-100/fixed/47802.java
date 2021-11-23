public void allBackToBase(com.aeroplanechess.model.Aeroplane[] aeroplanes, int playerIndex) {
    int start = playerIndex * 4;
    for (int i = start; i < (start + 4); i++)
        aeroplanes[i].setInCellId(((CellPrefix.Base.getPrefix()) + playerIndex));
    
}