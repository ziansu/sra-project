public int[] setGuess(int[] guess) {
    if (_masterOrGuesser) {
        java.util.ArrayList<java.lang.Integer> a1 = algorithm.guess(_gameBoard[_currentTurn], _pegsBoard[_currentTurn]);
        for (int i = 0; i < 4; i++)
            _currGuess[i] = a1.get(i);
        
    }else {
        super.setGuess(guess);
    }
    return _currGuess;
}