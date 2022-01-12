private void run(java.util.Scanner sc) throws java.lang.InterruptedException {
    while (true) {
        for (cluedo.Player player : players) {
            if (noMorePlayers()) {
                java.lang.System.out.println("No more players - everybody loses!");
                return ;
            }
            if (player.isEliminated()) {
                continue;
            }
            getHudInput(player, sc);
            if (isWon) {
                return ;
            }
        }
    } 
}