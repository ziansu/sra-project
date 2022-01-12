public boolean compareWords(java.lang.String playerWord) throws byui.CIT260.funnyWeekend.exceptions.CompareWordsControlException {
    if ("".equals(playerWord))
        throw new byui.CIT260.funnyWeekend.exceptions.CompareWordsControlException("You need to input the word");
    
    match = false;
    java.lang.String[][] words = game.getWords();
    for (int i = 0; i < 6; i++)
        for (int j = 0; j < 10; j++) {
            if (words[i][j].equals(playerWord)) {
                match = true;
                break;
            }
        }
    
    return match;
}