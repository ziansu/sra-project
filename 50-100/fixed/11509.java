public int makeTurn() {
    int winAns = 9;
    if (((BotParser.mRound) == 1) || ((BotParser.mRound) == 2)) {
        return 3;
    }
    if ((BotParser.mRound) >= 3) {
        winAns = BotParser.mField.checkWin(BotParser.mBotId);
        if (winAns != 9)
            return winAns;
        
        winAns = BotParser.mField.checkWin(BotParser.mBotIdE);
        if (winAns != 9)
            return winAns;
        
    }
    int move = new java.util.Random().nextInt(7);
    return move;
}