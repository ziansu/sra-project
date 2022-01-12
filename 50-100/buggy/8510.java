private void restoreCursor(org.eclipse.swt.widgets.Control control) {
    org.eclipse.swt.graphics.Cursor oldCursor = ((org.eclipse.swt.graphics.Cursor) (control.getData("pdetools-old-cursor")));
    if ((oldCursor != null) && (oldCursor.isDisposed())) {
        oldCursor = null;
    }
    control.setCursor(oldCursor);
}