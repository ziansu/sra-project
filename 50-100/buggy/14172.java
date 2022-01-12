public static void main(java.lang.String[] args) throws java.lang.Exception {
    com.bayviewglen.zork.Game game = new com.bayviewglen.zork.Game();
    try {
        java.io.FileInputStream f_in = new java.io.FileInputStream("savegame.data");
        java.io.ObjectInputStream obj_in = new java.io.ObjectInputStream(f_in);
        game = ((com.bayviewglen.zork.Game) (obj_in.readObject()));
    } catch (java.lang.Exception ex) {
        game = new com.bayviewglen.zork.Game();
    }
    game.play();
}