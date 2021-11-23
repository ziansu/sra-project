@java.lang.Override
protected java.lang.Boolean doInBackground() {
    try {
        timeConsumingSetupScheme(taskFile);
        return true;
    } catch (final edu.brandeis.cs.nlp.mae.MaeException e) {
        javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                showError(e);
            }
        });
        return false;
    }
}