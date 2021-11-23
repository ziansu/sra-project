@java.lang.Override
public void execute(network.Session session, game.model.Game game) {
    game.util.GameRenderer gameRenderer = game.getGameRenderer();
    if ((this.backgroundValue) != null) {
        gameRenderer.setBackgroundColor(this.backgroundValue);
    }
    if ((this.foregroundValue) != null) {
        gameRenderer.setForegroundColor(this.backgroundValue);
    }
}