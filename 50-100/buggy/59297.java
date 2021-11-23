public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    net.sourceforge.pmd.Rule rule = soleRule();
    int selectionIdx = xpathVersionField.getSelectionIndex();
    java.lang.Object newValue = ep.choices()[selectionIdx][1];
    if (newValue.equals(rule.getProperty(ep)))
        return ;
    
    rule.setProperty(ep, newValue);
}