public synchronized void stand(CardGame.User user) {
    CardGame.GameEngine.Player player = getPlayer(user);
    player.setFinishedRound(true);
}