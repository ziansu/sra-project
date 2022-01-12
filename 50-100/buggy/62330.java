protected void drop(tetris.Droppable piece) {
    if (!(falling.isFalling())) {
        falling.setDroppable(piece);
        falling.setX(findMiddle(falling.getDroppable()));
        falling.setY(getStartingHeight());
        tick();
        isFirstPlacement = true;
    }else {
        throw new java.lang.IllegalStateException("already falling");
    }
}