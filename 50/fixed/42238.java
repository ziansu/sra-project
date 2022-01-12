public main.java.group37.bejeweled.board.Tile containsSpecialGem() {
    for (main.java.group37.bejeweled.board.Tile t1 : this.getTiles()) {
        if (((t1 instanceof main.java.group37.bejeweled.board.FlameTile) || (t1 instanceof main.java.group37.bejeweled.board.HypercubeTile)) || (t1 instanceof main.java.group37.bejeweled.board.StarTile)) {
            return t1;
        }
    }
    return null;
}