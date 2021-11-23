public static void showMainFrame() {
    javax.swing.SwingUtilities.invokeLater(() -> {
        games.strategy.engine.framework.startup.ui.MainFrame.clearInstance();
        final games.strategy.engine.framework.startup.ui.MainFrame frame = new games.strategy.engine.framework.startup.ui.MainFrame();
        frame.requestFocus();
        frame.toFront();
        frame.setVisible(true);
    });
}