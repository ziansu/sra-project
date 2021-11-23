@java.lang.Override
public void setControllerManager(controller.ControllerManager ccontrollerManager) {
    super.setControllerManager(ccontrollerManager);
    commandParser.setControllerManager(ccontrollerManager);
}