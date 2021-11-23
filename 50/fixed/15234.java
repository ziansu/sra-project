public void nextTurn() {
    if ((turnPlayer) < ((randomList.size()) - 1)) {
        (turnPlayer)++;
    }else {
        turnPlayer = 0;
    }
}