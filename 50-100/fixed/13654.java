public static void main(java.lang.String[] args) {
    try {
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
    } catch (java.lang.ClassNotFoundException | java.lang.InstantiationException | java.lang.IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
    }
    java.awt.EventQueue.invokeLater(() -> {
        new org.domainmath.gui.update.UpdateFrame().setVisible(true);
    });
}