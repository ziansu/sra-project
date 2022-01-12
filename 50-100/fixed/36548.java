void moveVertices(int desiredVerticesToMove) {
    this.verticesToMove = desiredVerticesToMove;
    while (0 < (verticesToMove)) {
        if (moveFromA3BToC()) {
            continue;
        }
        if (swapBetweenAAndC()) {
            continue;
        }
        if (makeB3ANotEmpty()) {
            continue;
        }
        if (swapWithinA3CAndB3A()) {
            continue;
        }
        if (swapBetweenAAndBAndMoveToC()) {
            continue;
        }
    } 
}