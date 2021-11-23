public void add(board.Coordinate matchComponent) {
    jewel.Jewel jewel = board.getJewel(matchComponent);
    java.util.List<board.Coordinate> toAdd = jewel.getMatchCoordinates(board, matchComponent);
    if ((toAdd.size()) > 1) {
        board.Match match = new board.Match(board);
        toAdd.remove(matchComponent);
        match.addAll(toAdd);
        match.matchComponents.add(matchComponent);
        this.add(match);
    }else {
        matchComponents.addAll(toAdd);
    }
}