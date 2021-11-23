public void notifyPits() {
    int num = 0;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 7; j++) {
            _mancalaPits.get((num++)).setNumStones(_mancalaBoard[i][j]);
        }
    }
}