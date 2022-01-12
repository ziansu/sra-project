public static void main(java.lang.String[] args) {
    no.uib.info233.v2017.khu010.oblig3.sql.SQLManager.mpgame = new no.uib.info233.v2017.khu010.oblig3.game.MultiPlayerGame("THismeTHo4", (-3));
    no.uib.info233.v2017.khu010.oblig3.sql.SQLManager server = new no.uib.info233.v2017.khu010.oblig3.sql.SQLManager(no.uib.info233.v2017.khu010.oblig3.sql.SQLManager.mpgame);
    server.hostOnlineGame();
    java.util.Map<java.lang.String, java.lang.String> opengames = server.findOpenGames();
    java.lang.String joinid = opengames.get("THismeTHo4");
    server.joinOnlineGame("nigguh", joinid);
    server.getOpponent();
    server.startGame();
}