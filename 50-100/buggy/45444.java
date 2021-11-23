@java.lang.Override
public void run() {
    try {
        method.invoke(object, args);
    } catch (aletheia.persistence.exceptions.PersistenceLockTimeoutException e) {
        aletheia.gui.common.PersistentTreeModel.logger.debug(("PersistenceLockTimeoutException. Re-invokeLatering method: " + method));
        javax.swing.SwingUtilities.invokeLater(this);
    } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException e) {
        throw new java.lang.RuntimeException(e);
    } catch (java.lang.reflect.InvocationTargetException e) {
        aletheia.gui.common.PersistentTreeModel.logger.error(e.getCause().getMessage(), e.getCause());
    }
}