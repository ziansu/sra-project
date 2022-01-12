public void increaseScore(int rowsCleared) {
    assert !(mLock);
    if (!(mLock))
        mScore += mScoreComputer.calculateScore(rowsCleared);
    
}