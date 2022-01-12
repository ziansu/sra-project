public org.magic.game.model.Turn getActualTurn() {
    if ((turns.size()) == 0)
        return new org.magic.game.model.Turn();
    
    return turns.get(((turns.size()) - 1));
}