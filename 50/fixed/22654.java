@java.lang.Override
public void widgetSelected(final org.eclipse.swt.events.SelectionEvent e) {
    threadExecutor.clearThreads();
    fetchAllChildren(schemaTree.getItems());
    updateItems(schemaTree.getItems(), false, false);
}