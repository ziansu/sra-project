public void notifyPits() {
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 7; j++) {
            _mancalaPits[i][j].setNumStones(_mancalaBoard[i][j]);
        }
    }
}