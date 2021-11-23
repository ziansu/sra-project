@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    setKeepAbbreviations(keepAbbrevBtn.getSelection());
    if (keepAbbrevBtn.getSelection()) {
        setSubstituteAbbreviations(false);
        substituteAbbrevBtn.setSelection(false);
        setExpandAbbrevs(false);
        expandAbbrevBtn.setSelection(false);
    }else
        if ((!(substituteAbbrevBtn.getSelection())) && (!(expandAbbrevBtn.getSelection()))) {
            setKeepAbbreviations(true);
            keepAbbrevBtn.setSelection(true);
        }
    
}