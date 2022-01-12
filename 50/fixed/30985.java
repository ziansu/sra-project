@java.lang.Override
public void propertyChange(final java.beans.PropertyChangeEvent pce) {
    ppcl.propertyChange(pce);
    updateContextMenu();
}