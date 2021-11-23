@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent arg0) {
    java.lang.String command = (((((((("save_properties " + (setMaxThreads.getText())) + " ") + (setAlgorithm.getText())) + " ") + (setSearchAlgorithm.getText())) + " ") + (setMaxSize.getText())) + " ") + (setView.getText());
    setChanged();
    notifyObservers(command);
    shellProperties.close();
    displayProperties.close();
}