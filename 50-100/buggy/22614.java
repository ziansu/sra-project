@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent arg0) {
    if ((FileSaveName.getText()) != "") {
        inputStrings = new java.lang.String[]{ "saveMaze" , mazeName , FileSaveName.getText() };
        setChanged();
        notifyObservers();
        saveShell.close();
        saveButton.setEnabled(true);
    }else {
        org.eclipse.swt.widgets.MessageBox mBox = new org.eclipse.swt.widgets.MessageBox(saveShell, org.eclipse.swt.SWT.OK);
        mBox.setMessage("you must enter a name for the save");
        mBox.open();
    }
}