private boolean playerIsLastToClose(int number) {
    boolean result = true;
    for (spare.n52.yadarts.entity.Player p : this.cricketScores.keySet()) {
        spare.n52.yadarts.games.cricket.CricketScore s = this.cricketScores.get(p);
        if ((p != (this.currentPlayer)) && (!(s.playerHasOpened(number)))) {
            result = false;
        }
    }
    return result;
}