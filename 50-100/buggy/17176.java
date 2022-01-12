private void manageMemberStats(java.lang.String userID, boolean answeredQuestion) {
    int totalAnswers = java.lang.Integer.parseInt(kuroodo.discordbot.trivia.leaderboards.xml.PlayerBoardConfigurator.getplayerTotalAnswers(userID));
    int totalScore = java.lang.Integer.parseInt(kuroodo.discordbot.trivia.leaderboards.xml.PlayerBoardConfigurator.getPlayerTotalScore(userID));
    if (answeredQuestion) {
        totalAnswers += 1;
        totalScore += 1;
    }
    kuroodo.discordbot.trivia.leaderboards.xml.PlayerBoardConfigurator.changePlayerData(userID, EXmlAttributes.ANSWERS, java.lang.String.valueOf(totalAnswers));
    kuroodo.discordbot.trivia.leaderboards.xml.PlayerBoardConfigurator.changePlayerData(userID, EXmlAttributes.SCORE, java.lang.String.valueOf(totalScore));
}