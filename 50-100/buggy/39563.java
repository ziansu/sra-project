private void setAvailableFromLastMove(int small) {
    clearAvailable();
    if (small != (-1)) {
        for (int dest = 0; dest < 9; dest++) {
            com.jumpsaildive.android.tictactoe.Tile tile = mSmallTiles[small][dest];
            if ((tile.getOwner()) == (Tile.Owner.NEITHER))
                addAvailable(tile);
            
        }
    }
    if (mAvailable.isEmpty()) {
        setAllAvailable();
    }
}