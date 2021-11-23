public static void main(java.lang.String[] args) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException, javax.swing.UnsupportedLookAndFeelException {
    if (!(ru.Snake.game.References.started)) {
        java.awt.EventQueue.invokeLater(new java.lang.Runnable() {
            public void run() {
                try {
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getCrossPlatformLookAndFeelClassName());
                    ru.Snake.SnakeMain.menu = new ru.Snake.game.frames.Menu();
                    ru.Snake.SnakeMain.menu.setVisible(true);
                    ru.Snake.SnakeMain.menu.setLocationRelativeTo(null);
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
        });
        ru.Snake.game.References.started = true;
    }
}