public void startGames(int n) {
    serv.setMaxChannels(n);
    games = new org.chernovia.net.games.parlour.acro.server.AcroGame[n];
    for (int i = 0; i < (games.length); i++) {
        games[i] = new org.chernovia.net.games.parlour.acro.server.AcroGame(serv, i);
        if (((serv.getType()) != (NetServ.LOCAL)) || (i > 0))
            new java.lang.Thread(games[i]).start();
        
    }
}