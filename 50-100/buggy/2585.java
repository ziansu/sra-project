public void endTrick() {
    java.lang.System.out.println("----------------------------");
    this.assignPoints();
    this.activeID = ((currentTrick.getPlayerNumber()) + (activeID)) % 4;
    java.lang.System.out.printf("Points: %d", players[this.activeID].getPoints());
    if ((trickNum) < 12) {
        this.startTrick();
        (trickNum)++;
    }else {
        this.endRound();
    }
}