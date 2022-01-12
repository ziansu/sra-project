@java.lang.Override
public java.lang.String getColumnText(java.lang.Object element, int columnIndex) {
    if (element == null) {
        return "";
    }
    final org.eclipse.egit.ui.internal.history.SWTCommit c = ((org.eclipse.egit.ui.internal.history.SWTCommit) (element));
    try {
        c.parseBody();
    } catch (java.io.IOException e) {
        org.eclipse.egit.ui.Activator.error("Error parsing body", e);
        return "";
    }
    return super.getColumnText(c, columnIndex);
}