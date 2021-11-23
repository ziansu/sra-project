public double getExploit() {
    if ((context.getActivePlayerId()) == 0) {
        return (player1Value) / ((numVisits) + (epsilon));
    }else {
        return (1 - (player1Value)) / ((numVisits) + (epsilon));
    }
}