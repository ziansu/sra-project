public com.studiohartman.jamepad.ControllerState getState(int index) throws java.lang.IllegalStateException {
    verifyInitialized();
    if ((index < (controllers.length)) && (index > 0)) {
        update();
        return com.studiohartman.jamepad.ControllerState.getInstanceFromController(controllers[index]);
    }else {
        return com.studiohartman.jamepad.ControllerState.getDisconnectedControllerInstance();
    }
}