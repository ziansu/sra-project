private void clearResults(java.awt.event.ActionEvent e) {
    for (fileprocessor.model.MetaCommand m : commandResults.keySet()) {
        final javax.swing.JLabel jLabel = commandResults.get(m);
        javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                jLabel.setText("");
            }
        });
    }
}