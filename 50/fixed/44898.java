public void FinishTurn() throws shared.model.ModelException {
    if ((!(this.CanFinishTurn())) || (!(gameState.nextTurn())))
        throw new shared.model.ModelException();
    
}