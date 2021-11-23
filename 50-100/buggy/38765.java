public void update() {
    java.lang.System.out.println(isGoingToCollide());
    if (!(isGoingToCollide())) {
        currentShape.updateLeftCorner(currentShape.getUpperLeftCornerX(), ((currentShape.getUpperLeftCornerY()) + 1));
    }else {
        addCurrentPieceToBoard();
        currentShape = shapeFactory.getShape();
    }
}