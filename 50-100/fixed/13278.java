public java.lang.Boolean beforeMoveOut(java.lang.Integer piratId, java.util.List<ru.mail.park.mechanics.utils.results.Result> results, ru.mail.park.mechanics.game.CoordPair targetCell) {
    if (isNeighbors(targetCell)) {
        return true;
    }else
        if (isUnderShip) {
            return gameBoard.isShipNeighbors((piratId / 3), targetCell);
        }else {
            return false;
        }
    
}