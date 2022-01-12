static boolean completePushImmediately(java.lang.String controllerInstanceId) {
    com.bluelinelabs.conductor.ControllerChangeHandler changeHandler = com.bluelinelabs.conductor.ControllerChangeHandler.inProgressPushHandlers.get(controllerInstanceId);
    if (changeHandler != null) {
        changeHandler.completeImmediately();
        com.bluelinelabs.conductor.ControllerChangeHandler.inProgressPushHandlers.remove(controllerInstanceId);
        return true;
    }
    return false;
}