public static void showPlayers(final games.strategy.engine.framework.IGame game, final java.awt.Component parent) {
    final games.strategy.triplea.ui.PlayersPanel panel = new games.strategy.triplea.ui.PlayersPanel(game.getPlayerManager(), game.getData());
    games.strategy.util.EventThreadJOptionPane.showMessageDialog(javax.swing.JOptionPane.getFrameForComponent(parent), panel, "Players", javax.swing.JOptionPane.PLAIN_MESSAGE, new games.strategy.util.CountDownLatchHandler(true));
}