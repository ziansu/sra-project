private static void fire() {
    javax.swing.SwingUtilities.invokeLater(() -> {
        apidemo.Analysis.m_model.fireTableDataChanged();
    });
}