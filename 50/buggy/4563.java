public static void main(java.lang.String[] args) {
    acpc.MatchState m = new acpc.MatchState();
    acpc.Game game = new acpc.KuhnGame();
    m.initState(game, 0);
    m.readMatchState(game, "MATCHSTATE:0:9:c:As|");
}