public void incorrect() {
    jeopardy.game.Player player = currentRound.incorrect();
    jeopardy.Saves.saveScore(player);
    panel.onIncorrect(player);
    bot.sendMessage(player.getScoreMessage());
    if (currentRound.everyoneAnswered()) {
        endRound();
        return ;
    }
    if (currentRound.hasPendingPlayers()) {
        panel.onAnswer(currentRound.pendingPlayer());
    }else {
        panel.onRoundStarted(currentRound);
    }
}