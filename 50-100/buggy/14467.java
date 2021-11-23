@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    entity = entities.get(comboModelEntity.getSelectionIndex()).entity;
    textFilter.setText("");
    tableViewer.setInput(getNames());
    tableViewer.setSelection(null);
    tableViewer.refresh(true);
    textFilter.setText("");
}