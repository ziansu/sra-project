public static void main(java.lang.String[] args) {
    java.awt.EventQueue.invokeLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            java.lang.String OS = java.lang.System.getProperty("os.name");
            if ((OS.indexOf("mac")) >= 0) {
                javax.swing.JOptionPane.showMessageDialog(null, ("Warning, only tested on Windows and Linux. " + "May behave unexpectedly on Mac OS's."));
            }
            main.com.ide.WorkBench pane = new main.com.ide.WorkBench();
            pane.loadWorkbench();
        }
    });
}