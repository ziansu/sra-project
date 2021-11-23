private static void fire() {
    javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            apidemo.Analysis.m_model.fireTableDataChanged();
        }
    });
}