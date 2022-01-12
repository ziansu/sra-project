public void endTrick() {
    java.lang.System.out.println("----------------------------");
    this.assignPoints();
    this.activeID = (((currentTrick.getPlayerNumber()) + (activeID)) + 1) % 4;
    java.lang.System.out.printf("Points: %d", players[this.activeID].getPoints());
    (this.activeID)--;
    if ((trickNum) < 12) {
        this.startTrick();
        (trickNum)++;
    }else {
        this.endRound();
    }
}