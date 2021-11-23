public java.util.List<stilkin.GoCoord> getSortedMoveList() {
    final java.util.ArrayList<stilkin.GoCoord> moveList = new java.util.ArrayList<stilkin.GoCoord>();
    for (int y = 0; y < (stilkin.GoField.MAX_HEIGHT); y++) {
        for (int x = 0; x < (stilkin.GoField.MAX_WIDTH); x++) {
            if (!(isEmptyCell(x, y))) {
                moveList.add(new stilkin.GoCoord(x, y));
            }
        }
    }
    return moveList;
}