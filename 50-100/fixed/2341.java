@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    java.lang.String selection = engine.getStatusModel().getServerControllerSelection();
    if ((!(engine.getStatusModel().getServerControllerRunning())) && (!(selection.equals("")))) {
        eu.netide.workbenchconfigurationeditor.controller.ControllerManager.getStarter().startServerController(selection);
        engine.getStatusModel().setServerControllerRunning(true);
        selectServerCombo.setEnabled(false);
    }
}