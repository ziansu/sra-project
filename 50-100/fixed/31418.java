private int calculateHeuristic(int[][] board) {
    double filledWeight = 1;
    double groupingFilledWeight = 1;
    double groupingEmptyWeight = 1;
    double shapesPlaceableWeight = 1;
    return ((int) (((((+(calculateNumFilledTiles(board))) * filledWeight) + ((calculateGrouping(board, 1)) * groupingFilledWeight)) + ((calculateGrouping(board, 0)) * groupingEmptyWeight)) + ((calculateShapesNotPlaceable(board)) * shapesPlaceableWeight)));
}