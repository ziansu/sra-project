public void run() {
    org.chrisle.netbeans.plugins.nbsymlink.components.CreateSymlinkDialog dialog = new org.chrisle.netbeans.plugins.nbsymlink.components.CreateSymlinkDialog();
    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
        @java.lang.Override
        public void windowClosing(java.awt.event.WindowEvent e) {
            java.lang.System.exit(0);
        }
    });
}