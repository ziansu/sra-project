public void add(board.Coordinate matchComponent) {
    jewel.Jewel jewel = board.getJewel(matchComponent);
    java.util.List<board.Coordinate> toAdd = jewel.getMatchCoordinates(board, matchComponent);
    if ((toAdd.size()) > 1) {
        board.Match match = new board.Match(board);
        match.addAll(toAdd);
        this.add(match);
    }else {
        this.addAll(toAdd);
    }
}