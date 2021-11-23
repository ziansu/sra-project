public static void main(java.lang.String[] args) {
    java.awt.EventQueue.invokeLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            gui.MainWin gui = gui.MainWin.getInstance();
            gui.setVisible(true);
        }
    });
}