boolean isMoveValidJumpMove() {
    if ((((startAndFinishAreDiagonallyOneSquareApart()) && (thereIsAnOpponentPieceInTheMiddle())) && (selectedPieceIsRed())) && (movingForward())) {
        return true;
    }else {
        return false;
    }
}