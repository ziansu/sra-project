public void initData(muzikk.Player player) {
    this.onShowWindow();
    this.playersInGame = new java.util.ArrayList<>();
    playerObsList.remove(0, playerObsList.size());
    scoreObsList.remove(0, scoreObsList.size());
    playersInGame.add(player);
    playerObsList.add(player.getName());
    scoreObsList.add(player.getScore());
    number_of_answered_questions = 0;
}