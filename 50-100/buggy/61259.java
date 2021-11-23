public static void main(java.lang.String[] args) {
    if ((args.length) == 2) {
        Config.WIDTH = java.lang.Integer.parseInt(args[0]);
        Config.HEIGHT = java.lang.Integer.parseInt(args[1]);
    }
    try {
        com.lithia.cs.core.main.Game game = new com.lithia.cs.core.main.Game();
        game.create();
        game.run();
    } catch (com.lithia.cs.core.main.LWJGLException e) {
        com.lithia.cs.core.main.Game.err(e, false);
    }
}