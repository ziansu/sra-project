@java.lang.Override
public void propertyChange(final java.beans.PropertyChangeEvent evt) {
    final long t = java.lang.System.currentTimeMillis();
    if ((evt.getNewValue()) == null)
        focuslosttime = t;
    else
        if (((evt.getOldValue()) == null) && ((t - (focuslosttime)) > 3)) {
            org.scijava.ui.behaviour.GlobalKeyEventDispatcher.instance.shiftPressed = false;
            org.scijava.ui.behaviour.GlobalKeyEventDispatcher.instance.metaPressed = false;
            org.scijava.ui.behaviour.GlobalKeyEventDispatcher.instance.winPressed = false;
            org.scijava.ui.behaviour.GlobalKeyEventDispatcher.instance.pressedKeys.clear();
        }
    
}