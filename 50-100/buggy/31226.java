@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    setSubstituteAbbreviations(substituteAbbrevBtn.getSelection());
    if (substituteAbbrevBtn.getSelection()) {
        setExpandAbbrevs(false);
        expandAbbrevBtn.setSelection(false);
        setKeepAbbreviations(false);
        keepAbbrevBtn.setSelection(false);
    }else {
        if (!(expandAbbrevBtn.getSelection())) {
            setKeepAbbreviations(true);
            keepAbbrevBtn.setSelection(true);
        }
    }
}