public boolean isTheMovePossible(oot.game.Token token, int column, int row) {
    return (calcOneField(token, column, row)) == 0 ? false : true;
}