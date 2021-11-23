public void shellDeactivated(org.eclipse.swt.events.ShellEvent arg0) {
    if (((shell) != null) && (!(shell.isDisposed()))) {
        currentSelection = list.getSelectionIndices();
        displayText();
        shell.dispose();
        parentComp.findText();
    }
}