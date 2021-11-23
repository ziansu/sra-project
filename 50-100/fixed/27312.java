public boolean nextTurn() {
    if (((state) == (shared.definitions.GameRound.ROLLING)) || ((state) == (shared.definitions.GameRound.ROBBING)))
        return false;
    
    (activePlayerIndex)++;
    if ((activePlayerIndex) > 3) {
        activePlayerIndex = 0;
        if ((state) == (shared.definitions.GameRound.FIRSTROUND))
            state = shared.definitions.GameRound.SECONDROUND;
        else
            if ((state) == (shared.definitions.GameRound.SECONDROUND))
                state = shared.definitions.GameRound.ROLLING;
            
        
    }
    return true;
}