public void FinishTurn() throws shared.model.ModelException {
    if (!(this.CanFinishTurn()))
        throw new shared.model.ModelException();
    
    gameState.nextTurn();
}