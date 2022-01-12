@java.lang.Override
public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
    final java.lang.String filterText = search.getText();
    outline.setFilterText(filterText);
}