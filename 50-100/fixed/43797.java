public boolean fieldEnded() {
    for (minesweeper.model.GeneralCell cell : cells.values()) {
        if (cell instanceof minesweeper.model.PotentialMineCell) {
            minesweeper.model.Counter counter = new minesweeper.model.Counter();
            cell.countIfBomb(counter);
            if (counter.counterSymbol().equals("0"))
                return false;
            
        }
    }
    return true;
}