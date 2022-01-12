com.sudoku.puzzlesolver.Point findNextUnassignedLocation() {
    for (com.sudoku.puzzlesolver.AllPoints allPoints = new com.sudoku.puzzlesolver.AllPoints(); allPoints.hasNext();) {
        com.sudoku.puzzlesolver.Point currentPoint = allPoints.next();
        if ((getNumber(currentPoint)) == null) {
            return currentPoint;
        }
    }
    return null;
}