@java.lang.Override
public void propertyChange(java.beans.PropertyChangeEvent evt) {
    if (javax.swing.Action.SMALL_ICON.equals(evt.getPropertyName())) {
        fixIcon(null);
    }
}