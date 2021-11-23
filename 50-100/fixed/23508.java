@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    setExpandAbbrevs(expandAbbrevBtn.getSelection());
    if (expandAbbrevBtn.getSelection()) {
        setSubstituteAbbreviations(false);
        substituteAbbrevBtn.setSelection(false);
        setKeepAbbreviations(false);
        keepAbbrevBtn.setSelection(false);
    }else {
        if (!(substituteAbbrevBtn.getSelection())) {
            setKeepAbbreviations(true);
            keepAbbrevBtn.setSelection(true);
        }
    }
}