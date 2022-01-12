public static project.Game loadGameOption() {
    project.Game game = null;
    java.lang.System.out.println("Put File Name");
    java.lang.String file_name = new project.strategy.Human().inputString();
    game = project.Game.loadGame(file_name);
    if (game == null) {
        java.lang.System.out.println("Put Another File Name");
        game = project.Game.loadGameOption();
    }
    return game;
}