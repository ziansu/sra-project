public void determineWinners(Dealer dealer) {
    for (Player player : Player.players) {
        java.lang.String outcome = player.determineWin(dealer);
        switch (outcome) {
            case "tie" :
                World.ties += 1;
                break;
            case "error" :
                World.errors += 1;
                break;
            case "true" :
                World.wins += 1;
                break;
            case "false" :
                World.losses += 1;
                break;
        }
    }
    World.games += 1;
}