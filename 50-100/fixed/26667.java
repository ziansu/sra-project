public void setEnableCalc(final boolean enable) {
    java.lang.Runnable setModel = new java.lang.Runnable() {
        public void run() {
            ((javax.swing.JPanel) (fdrSettings)).setEnabled(enable);
            fdrSettingsComplete.setEnabled(enable);
            fdrSettingsSimple.setEnabled(enable);
        }
    };
    javax.swing.SwingUtilities.invokeLater(setModel);
}