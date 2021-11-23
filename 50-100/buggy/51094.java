@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    if (!(engine.getStatusModel().getServerControllerRunning())) {
        eu.netide.workbenchconfigurationeditor.controller.ControllerManager.getStarter().stopServerController();
        engine.getStatusModel().setServerControllerRunning(false);
        selectServerCombo.setEnabled(true);
    }
}