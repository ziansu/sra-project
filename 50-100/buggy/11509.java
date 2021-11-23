public int makeTurn() {
    int winAns = 9;
    if (((BotParser.mRound) == 1) || ((BotParser.mRound) == 2))
        return 3;
    else
        if ((BotParser.mRound) > 5)
            winAns = BotParser.mField.checkWin(BotParser.mBotId);
        
    
    if (winAns != 9)
        return winAns;
    
    winAns = BotParser.mField.checkWin(BotParser.mBotIdE);
    if (winAns != 9)
        return winAns;
    else {
        int move = new java.util.Random().nextInt(7);
        return move;
    }
}