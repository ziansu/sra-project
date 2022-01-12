@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    setShowSuppliedWithBrackets(showSuppliedWithBracketsBtn.getSelection());
    if (showSuppliedWithBracketsBtn.getSelection()) {
        setIgnoreSupplied(false);
        ignoreSuppliedBtn.setSelection(false);
    }
}