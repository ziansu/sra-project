public static double stateScore(client.State state, client.Move move) {
    double ret = 0;
    client.Cell[] myCell = client.AI.game.getMap().getMyCells();
    for (int i = 0; i < (myCell.length); i++) {
        if ((myCell[i]) == null)
            continue;
        
        if ((client.AI.cellState(myCell[i]).compareTo(state)) == 0) {
        }
    }
    return ret;
}