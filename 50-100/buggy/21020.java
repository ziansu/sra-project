public static void main(java.lang.String[] args) {
    java.awt.EventQueue.invokeLater(new java.lang.Runnable() {
        public void run() {
            try {
                com.werlsoft.liveftp.start.LiveFTP.frame = new com.werlsoft.liveftp.gui.main.MainWindow(new com.werlsoft.liveftp.gui.panel.MainPanel());
                com.werlsoft.liveftp.start.LiveFTP.frame.setVisible(true);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    });
    com.werlsoft.liveftp.start.LiveFTP.hostName = args[0];
    com.werlsoft.liveftp.start.LiveFTP.userName = args[1];
    com.werlsoft.liveftp.start.LiveFTP.password = args[2];
}