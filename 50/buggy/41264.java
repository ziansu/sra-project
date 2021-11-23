@java.lang.Override
public int compare(java.lang.String o1, java.lang.String o2) {
    if (org.eclipse.dirigible.ide.db.viewer.views.DatabaseViewerToolBar.DEFAULT_DS_NAME.equals(o2)) {
        return java.lang.Integer.MAX_VALUE;
    }
    if (org.eclipse.dirigible.ide.db.viewer.views.DatabaseViewerToolBar.DEFAULT_DS_NAME.equals(o1)) {
        return java.lang.Integer.MIN_VALUE;
    }
    return o1.compareTo(o2);
}