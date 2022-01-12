public static void main(java.lang.String[] args) {
    try {
        javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } catch (java.lang.Throwable e) {
    }
    java.awt.EventQueue.invokeLater(new java.lang.Runnable() {
        public void run() {
            try {
                com.psi1.window.Window window = new com.psi1.window.Window();
                window.frmJ.setVisible(true);
            } catch (java.lang.Exception e) {
            }
        }
    });
}