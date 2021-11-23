public org.mapeditor.core.Map nextTurn() {
    if (!(isGameOver())) {
        boolean isStalemateForPlayer = isStalemateTurnForPlayer(utilties.models.Game.PLAYER_ID);
        boolean isStalemateForOpponent = isStalemateTurnForPlayer(utilties.models.Game.OPPONENT_ID);
        if (isStalemateForPlayer && isStalemateForOpponent) {
            _isStalemate = true;
            this._isGameOver = true;
        }else
            if ((this._numberOfTurnsCompleted) > (utilties.models.Game.MAX_TURN_LIMIT)) {
                _isStalemate = true;
                this._isGameOver = true;
            }
        
        (this._numberOfTurnsCompleted)++;
    }
    return this._entityMap.getMap();
}