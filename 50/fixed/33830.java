private static void showScores() {
    for (me.peterg.Player player : me.peterg.Main.players.values()) {
        java.lang.System.out.println(player.generateScore());
    }
}