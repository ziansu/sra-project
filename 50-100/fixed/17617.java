@java.lang.Override
public void controlMoved(org.eclipse.swt.events.ControlEvent e) {
    if (hlShell.isDisposed()) {
        removeListeners();
        return ;
    }
    org.eclipse.swt.graphics.Rectangle clientArea = parentShell.getDisplay().map(parentShell, null, parentShell.getClientArea());
    hlShell.setLocation(clientArea.x, clientArea.y);
}