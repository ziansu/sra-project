public static int calculateHighScorePosition(int playerScore) {
    if (playerScore > 1000) {
        return 1;
    }else
        if ((playerScore > 500) && (playerScore < 1000)) {
            return 2;
        }else
            if ((playerScore > 100) && (playerScore < 500)) {
                return 3;
            }else {
                return 4;
            }
        
    
}