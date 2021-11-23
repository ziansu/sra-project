public void createGameObjects() {
    gamesToday = new java.util.ArrayList<Game>();
    java.lang.System.out.println("   gamesToday made");
    for (java.lang.String s : gameAddresses) {
        gamesToday.add(new Game(s));
        java.lang.System.out.println("    Game made");
    }
}