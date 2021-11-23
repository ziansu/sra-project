public void startBattle() {
    model.Squad squad1 = new model.Squad(team1Name, team1);
    model.Squad squad2 = new model.Squad(team2Name, team2);
    msg.append("Битва началась!!! ").append(model.DataHelper.getFormattedStartDate()).append("\n");
    notifyObserver();
    startFight(squad1, squad2);
    msg.append("Бой продолжался: ").append(model.DataHelper.getFormattedDiff());
    notifyObserver();
}