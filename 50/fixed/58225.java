@java.lang.Override
public void widgetSelected(final org.eclipse.swt.events.SelectionEvent event) {
    if (useFileTextRadio.getSelection()) {
        useFilterTextRadio.setSelection(false);
        updateSqlText();
    }
}