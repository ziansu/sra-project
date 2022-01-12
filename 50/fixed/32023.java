private void showCreateWindow() {
    javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
        public void run() {
            new org.xxz.csgui.CreateWindow(org.xxz.csgui.MainWindow.this);
        }
    });
}