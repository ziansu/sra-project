@java.lang.Override
public void run() {
    try {
        try {
            method.invoke(object, args);
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw e.getCause();
        }
    } catch (aletheia.persistence.exceptions.PersistenceLockTimeoutException e) {
        aletheia.gui.common.PersistentTreeModel.logger.debug(("PersistenceLockTimeoutException. Re-invokeLatering method: " + method));
        javax.swing.SwingUtilities.invokeLater(this);
    } catch (java.lang.Throwable e) {
        throw new java.lang.RuntimeException(e);
    }
}