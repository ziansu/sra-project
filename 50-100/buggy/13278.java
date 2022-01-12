public java.lang.Boolean beforeMoveOut(java.lang.Integer piratId, java.util.List<ru.mail.park.mechanics.utils.results.Result> results, ru.mail.park.mechanics.game.CoordPair targetCell) {
    if (isUnderShip) {
        return gameBoard.isShipNeighbors((piratId / 3), targetCell);
    }else
        if (isNeighbors(targetCell)) {
            return true;
        }else {
            results.add(new ru.mail.park.mechanics.utils.results.MovementResult((-2)));
            return false;
        }
    
}