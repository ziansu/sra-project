private void startDMI() {
    try {
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
    } catch (java.lang.ClassNotFoundException | java.lang.InstantiationException | java.lang.IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
    }
    java.awt.EventQueue.invokeLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            new org.domainmath.gui.update.UpdateFrame().setVisible(true);
        }
    });
}