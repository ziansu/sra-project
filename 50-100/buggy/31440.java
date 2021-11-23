public void initData(java.util.ArrayList<muzikk.Player> playerList) {
    this.onShowWindow();
    this.playersInGame = playerList;
    for (muzikk.Player p : playersInGame) {
        playerObsList.add(p.getName());
        scoreObsList.add(p.getScore());
    }
    number_of_answered_questions = 0;
}