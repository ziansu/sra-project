public boolean makeMove(model.IMove move) {
    deselectAll();
    if (move.doMove()) {
        score += move.getScore();
        (moveCount)++;
        if (move instanceof model.RemoveSpecialMove) {
            (numRemoveMoves)--;
        }else
            if (move instanceof model.ResetSpecialMove) {
                (numResetMoves)--;
            }else
                if (move instanceof model.SwapSpecialMove) {
                    (numSwapMoves)--;
                }
            
        
        return true;
    }
    return false;
}