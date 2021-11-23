@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    columnList.removeAll(((org.eclipse.jface.viewers.IStructuredSelection) (columnsElementViewer.getSelection())).toList());
    columnsElementViewer.setInput(columnList);
    enabledButtons(buttons, false);
    masterPage.setDirty(true);
    computeRefreshDataPreviewPart(isLeftPart, columnList, columnsElementViewer);
}