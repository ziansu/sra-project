public static void main(java.lang.String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        try {
            javax.swing.UIManager.setLookAndFeel(new org.jvnet.substance.skin.SubstanceBusinessBlackSteelLookAndFeel());
            javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);
        } catch (javax.swing.UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        org.randac.Application app = new org.randac.Application();
        javax.swing.SwingUtilities.updateComponentTreeUI(app);
        app.setVisible(true);
    });
}