@java.lang.Override
public void executeCommand(org.ovirt.engine.ui.uicommonweb.UICommand command) {
    super.executeCommand(command);
    if ("OnSave".equalsIgnoreCase(command.getName())) {
        onSave();
    }
}