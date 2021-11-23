@java.lang.Override
public void widgetSelected(final org.eclipse.swt.events.SelectionEvent e) {
    if (this.enabledCheckbox.equals(e.getSource())) {
        setEnabled(((org.eclipse.swt.widgets.Button) (e.getSource())).getSelection());
    }
    getWizard().getContainer().updateButtons();
}