public static org.eclipse.swt.graphics.Rectangle getBounds(org.eclipse.swt.widgets.TreeItem item) {
    org.eclipse.swt.graphics.Rectangle bounds = item.getBounds();
    if (((item.getParent().getColumnCount()) > 0) && ((bounds.width) <= 1)) {
        bounds.width = item.getParent().getBounds().width;
    }
    return item.getDisplay().map(item.getParent(), null, bounds);
}