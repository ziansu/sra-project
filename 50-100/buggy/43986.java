public boolean okToLeave() {
    boolean readyToLeave = false;
    if (dirty) {
        readyToLeave = updateSLD();
    }
    if (readyToLeave) {
        return true;
    }else {
        return org.eclipse.jface.dialogs.MessageDialog.openQuestion(org.eclipse.swt.widgets.Display.getCurrent().getActiveShell(), Messages.StyleEditor_xml_lose_changes_1, Messages.StyleEditor_xml_lose_changes_2);
    }
}