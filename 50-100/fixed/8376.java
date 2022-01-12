public boolean isItPossibleToShoot(de.hsbremen.battleshipextreme.model.FieldState[][] board, int startX, int startY) {
    boolean result = false;
    de.hsbremen.battleshipextreme.model.FieldState state = board[startY][startX];
    if ((state == (de.hsbremen.battleshipextreme.model.FieldState.HAS_SHIP)) || (state == (de.hsbremen.battleshipextreme.model.FieldState.IS_EMPTY))) {
        result = true;
    }
    return result;
}