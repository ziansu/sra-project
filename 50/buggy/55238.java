@java.lang.Override
public void run() {
    game.getScreen().dispose();
    game.setScreen(new com.nazacheres.followme.Menu.ChooseGameMenu.ChooseGameScrn(game));
}