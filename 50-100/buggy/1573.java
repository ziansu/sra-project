public void saveKader() {
    if (!(wettbewerb.teamsHaveKader()))
        return ;
    
    java.util.ArrayList<java.lang.String> players = new java.util.ArrayList<>();
    for (int i = 0; i < (numberOfPlayers); i++) {
        players.add(this.kader.get(i).toString());
    }
    inDatei(kaderFileName, players);
}