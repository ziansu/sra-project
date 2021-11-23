@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    if (columnList.remove(((org.eclipse.jface.viewers.IStructuredSelection) (columnsElementViewer.getSelection())).getFirstElement())) {
        columnsElementViewer.setInput(columnList);
        enabledButtons(buttons, false);
        masterPage.setDirty(true);
        computeRefreshDataPreviewPart(isLeftPart, columnList, columnsElementViewer);
    }
}