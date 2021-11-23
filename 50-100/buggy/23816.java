@java.lang.Override
protected void done() {
    try {
        get();
    } catch (java.lang.InterruptedException ex) {
        java.util.logging.Logger.getLogger(shadowfileconverter.ShadowFileConverterJForme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (java.util.concurrent.ExecutionException ex) {
        if ((ex.getCause()) instanceof java.lang.reflect.InvocationTargetException) {
        }
        if ((ex.getCause()) instanceof java.util.concurrent.CancellationException) {
        }
    }
    working = false;
    actionJButton.setText("Start");
}