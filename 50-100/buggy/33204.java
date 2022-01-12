public void add_players() {
    playerDB = new com.dmcinfo.cutthroatpooltracker.MainActivity.PlayerDB(this);
    playerDB.addPlayer("Nick", "A");
    playerDB.addPlayer("Tyler", "B");
    playerDB.addPlayer("Otto", "G");
    playerDB.addPlayer("Jimmy", "C");
    playerDB.addPlayer("Sully", "J");
    playerDB.addPlayer("Boris", "C");
    playerDB.addPlayer("Devon", "F");
    playerDB.addPlayer("Tim", "Gee");
    playerDB.addPlayer("Guest", "-");
    load_players();
}