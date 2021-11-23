@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    org.eclipse.jface.viewers.IStructuredSelection selection = ((org.eclipse.jface.viewers.IStructuredSelection) (tableViewer.getSelection()));
    if ((selection == null) || (selection.isEmpty())) {
        return ;
    }
    com.starterkit.views.models.Task task = ((com.starterkit.views.models.Task) (selection.getFirstElement()));
    java.lang.Long id = task.getId();
    dataProvider.closeTask(id);
    tableViewer.refresh();
}