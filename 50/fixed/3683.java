public void widgetSelected(org.eclipse.swt.events.SelectionEvent evt) {
    value = combo.getSelectionIndex();
    setPresentsDefaultValue(false);
    fireValueChanged(org.eclipse.ice.viz.service.preferences.VALUE, value, combo.getSelectionIndex());
}