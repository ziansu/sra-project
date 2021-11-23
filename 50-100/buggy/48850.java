private void setEnableRead(final boolean enable) {
    java.lang.Runnable setModel = new java.lang.Runnable() {
        public void run() {
            csvSelect.setEnabled(enable);
            btnReadMZIdent.setEnabled((enable && (((javax.swing.JPanel) (fdrSettings)).isEnabled())));
        }
    };
    javax.swing.SwingUtilities.invokeLater(setModel);
}