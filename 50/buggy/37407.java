@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    java.lang.String text = combo.getText();
    updateSuggestions(text);
    combo.setText(text);
}