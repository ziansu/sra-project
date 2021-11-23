private void setup() {
    try {
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
    } catch (java.lang.ClassNotFoundException | java.lang.InstantiationException | java.lang.IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        ex.printStackTrace();
    }
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    tabbedPane = new javax.swing.JTabbedPane();
    tabbedPane.addTab("Info", infoPane);
    tabbedPane.addTab("Clients", connectionPane);
    add(tabbedPane);
    setLocationRelativeTo(null);
    setResizable(false);
    pack();
    setVisible(true);
}