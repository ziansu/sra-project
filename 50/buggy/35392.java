@java.lang.Override
public void update(float deltaTime) {
    gameapp.framework.Graphics g = game.getGraphics();
    game.setScreen(new com.gameapp.gameapp.LoadingScreen(game));
}