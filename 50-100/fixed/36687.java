public void determineWinners(Dealer dealer, Player player) {
    java.lang.String outcome = player.determineWin(dealer);
    switch (outcome) {
        case "tie" :
            (World.ties)++;
            break;
        case "error" :
            (World.errors)++;
            break;
        case "true" :
            (World.wins)++;
            break;
        case "false" :
            (World.losses)++;
            break;
    }
    (World.games)++;
}