protected org.eclipse.ui.forms.widgets.ExpandableComposite getParentExpandableComposite(org.eclipse.php.internal.ui.preferences.Control control) {
    org.eclipse.php.internal.ui.preferences.Control parent = control.getParent();
    while ((!(parent instanceof org.eclipse.ui.forms.widgets.ExpandableComposite)) && (parent != null)) {
        parent = parent.getParent();
    } 
    if (parent instanceof org.eclipse.ui.forms.widgets.ExpandableComposite) {
        return ((org.eclipse.ui.forms.widgets.ExpandableComposite) (parent));
    }
    return null;
}