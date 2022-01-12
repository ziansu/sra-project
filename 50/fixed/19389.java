boolean isMoveValidJumpMove() {
    if (((startAndFinishAreDiagonallyOneSquareApart()) && (thereIsAnOpponentPieceInTheMiddle())) && (movingForward())) {
        return true;
    }else {
        return false;
    }
}