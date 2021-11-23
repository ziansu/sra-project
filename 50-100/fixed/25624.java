public void shellDeactivated(org.eclipse.swt.events.ShellEvent arg0) {
    if (((shell) != null) && (!(shell.isDisposed()))) {
        currentSelection = list.getSelectionIndices();
        displayText();
        parentComp.start = 0;
        parentComp.findText();
        shell.dispose();
    }
}