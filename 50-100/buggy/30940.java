public void run() {
    new projekt.MainWindow().setVisible(true);
    projekt.LoginWindow dialog = new projekt.LoginWindow(new javax.swing.JFrame(), true);
    dialog.setFocusable(true);
    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
        @java.lang.Override
        public void windowClosing(java.awt.event.WindowEvent e) {
            java.lang.System.exit(0);
        }
    });
    dialog.setVisible(true);
}