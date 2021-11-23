public java.lang.String restart() {
    user = "";
    position = 1;
    state = new int[word.length()];
    for (int a = 0; a < (state.length); a++) {
        state[a] = com.mygdx.game.WordHandler.CLEAR;
    }
    shuffleLetters();
    return word;
}