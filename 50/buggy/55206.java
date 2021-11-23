public static void main(final java.lang.String[] args) {
    gui.windowmanagement.Main.game = gamelogic.Game.getInstance();
    gui.windowmanagement.Main.game.start();
    javafx.application.Application.launch(args);
}