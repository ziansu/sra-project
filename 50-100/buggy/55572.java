@java.lang.Override
protected java.lang.Void doInBackground() {
    try {
        timeConsumingSetupScheme(taskFile);
    } catch (final edu.brandeis.cs.nlp.mae.MaeException e) {
        javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                cancel(true);
                showError(e);
            }
        });
    }
    return null;
}