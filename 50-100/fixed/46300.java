@java.lang.Override
public void mouseUp(org.eclipse.swt.events.MouseEvent event) {
    super.mouseUp(event);
    currentSelection = list.getSelectionIndices();
    if (((event.stateMask) & (org.eclipse.swt.SWT.CTRL)) == 0) {
        displayText();
        parentComp.findText();
        shell.dispose();
    }
}