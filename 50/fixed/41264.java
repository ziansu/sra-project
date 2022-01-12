@java.lang.Override
public int compare(java.lang.String o1, java.lang.String o2) {
    if (org.eclipse.dirigible.ide.db.viewer.views.DatabaseViewerToolBar.DEFAULT_DS_NAME.equals(o2)) {
        return 1;
    }
    if (org.eclipse.dirigible.ide.db.viewer.views.DatabaseViewerToolBar.DEFAULT_DS_NAME.equals(o1)) {
        return -1;
    }
    return o1.compareTo(o2);
}