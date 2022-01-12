@java.lang.Override
public void handleEvent(java.awt.Event e) {
    if ((e.keyCode) == (org.eclipse.swt.SWT.F3)) {
        handleSearchDisplay();
    }
    if ((e.character) == (org.eclipse.swt.SWT.DEL)) {
        delete();
    }
    if ((e.keyCode) == (org.eclipse.swt.SWT.F5)) {
        refreshTableViewer(false);
    }
}