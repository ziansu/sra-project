@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    if (enabledCheckbox.equals(e.getSource())) {
        setEnabled(((org.eclipse.swt.widgets.Button) (e.getSource())).getSelection());
    }
    getWizard().getContainer().updateButtons();
}