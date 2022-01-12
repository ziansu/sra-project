public void createGameObjects() {
    gamesToday = new java.util.ArrayList<Game>();
    for (java.lang.String s : gameAddresses) {
        gamesToday.add(new Game(s));
    }
}