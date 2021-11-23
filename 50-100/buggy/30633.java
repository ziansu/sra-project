public void initData(muzikk.Player player) {
    this.onShowWindow();
    this.playersInGame = new java.util.ArrayList<>();
    playersInGame.add(player);
    playerObsList.add(player.getName());
    scoreObsList.add(player.getScore());
    number_of_answered_questions = 0;
}