public void increaseScore(int rowsCleared) {
    if (!(mLock))
        mScore += mScoreComputer.calculateScore(rowsCleared);
    
}