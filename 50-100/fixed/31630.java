private static org.eclipse.jface.viewers.TableViewerColumn createTableViewerColumn(java.lang.String title, int bound, final int colNumber, final org.eclipse.jface.viewers.TableViewer viewer) {
    final org.eclipse.jface.viewers.TableViewerColumn viewerColumn = new org.eclipse.jface.viewers.TableViewerColumn(viewer, org.eclipse.swt.SWT.NONE);
    final org.eclipse.swt.widgets.TableColumn column = viewerColumn.getColumn();
    column.setText(title);
    column.setWidth(bound);
    column.setResizable(true);
    return viewerColumn;
}