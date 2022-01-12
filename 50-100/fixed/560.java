public static void move(com.pansmileSoftware.pixelPuzzle.model.Square square, com.pansmileSoftware.pixelPuzzle.model.Square emptySquare) {
    if (emptySquare.isEmpty()) {
        int numberOfEmpty = emptySquare.getCurrentNumber();
        if (square.canBeMoved(numberOfEmpty, square.sideSize)) {
            int squareNumber = square.getCurrentNumber();
            square.moveToNumber(numberOfEmpty, square.sideSize);
            emptySquare.moveToNumber(squareNumber, square.sideSize);
        }
    }
}