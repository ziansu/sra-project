@java.lang.Override
public void updateError(int error) {
    if (error != (MessageId.ErrorId.OK.getIntRepresentation())) {
        controllerManager.setController(Id.MAIN_CONTROLLER.getIntRepresentation(), null);
    }
    setBlockConsole(false);
}