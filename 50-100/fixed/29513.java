public int RollDice() throws shared.model.ModelException {
    if ((gameState.state) != (shared.definitions.GameRound.ROLLING))
        throw new shared.model.ModelException("Game isn't in rolling state");
    
    java.util.Random randomGen = new java.util.Random();
    int diceRoll = ((randomGen.nextInt(5)) + (randomGen.nextInt(5))) + 2;
    DiceRoll(diceRoll);
    return diceRoll;
}