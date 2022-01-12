private void gameInit() throws java.io.IOException, java.lang.ClassNotFoundException {
    java.util.ArrayList<java.lang.String> names = new java.util.ArrayList<java.lang.String>(NUM_PLAYER);
    for (int i = 0; i < (NUM_PLAYER); i++) {
        output[i].writeObject("Please specify your username");
        java.lang.String username = ((java.lang.String) (input[i].readObject()));
        names.add(username);
    }
    game = new Game(names);
    java.lang.System.out.println("new Game");
    gameHelper(game);
}