private void draw(java.lang.String filePath, org.eclipse.swt.graphics.Rectangle bounds) {
    _label = new org.eclipse.swt.widgets.Label(_window.getShell(), org.eclipse.swt.SWT.None);
    loadNewImage(filePath);
    if (bounds != null)
        resize(bounds);
    
}