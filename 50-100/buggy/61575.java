private void createTableColumn() {
    final org.eclipse.jface.viewers.TableViewerColumn col = new org.eclipse.jface.viewers.TableViewerColumn(com.laboki.eclipse.plugin.fastopen.ui.Dialog.VIEWER, (((org.eclipse.swt.SWT.RIGHT) | (org.eclipse.swt.SWT.LEFT)) | (org.eclipse.swt.SWT.CENTER)));
    col.getColumn().setWidth(com.laboki.eclipse.plugin.fastopen.ui.Dialog.TABLE.getClientArea().width);
    col.getColumn().setResizable(true);
    col.setLabelProvider(new com.laboki.eclipse.plugin.fastopen.ui.Dialog.LabelProvider());
    if (com.laboki.eclipse.plugin.fastopen.main.EditorContext.isLinux())
        col.getColumn().pack();
    
}