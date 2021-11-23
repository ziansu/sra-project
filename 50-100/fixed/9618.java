@java.lang.Override
public boolean hasWon() {
    sixesWildEntity.Board board = sixesWildEntity.Board.newInstance();
    if ((board.currentScore) >= (highestScore)) {
        highestScore = board.currentScore;
    }
    if ((highestScore) >= (threeStarScore)) {
        starNumber = 3;
    }else
        if ((highestScore) >= (twoStarScore)) {
            starNumber = 2;
        }else
            if ((highestScore) >= (oneStarScore)) {
                starNumber = 1;
            }
        
    
    return (board.currentScore) >= (oneStarScore);
}