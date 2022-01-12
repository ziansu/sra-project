public void addPlayer(java.lang.String nme, java.lang.String corh) {
    Player pl;
    corh = corh.toUpperCase();
    if ((corh != null) && (corh.equals("C"))) {
        pl = new ComputerPlayer(nme);
    }else {
        pl = new HumanPlayer(nme);
    }
    players.add(pl);
}