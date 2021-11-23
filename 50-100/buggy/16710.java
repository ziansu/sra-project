@java.lang.Override
public java.lang.reflect.Method resolveAction(java.lang.String controller, java.lang.String action) {
    try {
        org.rpwf.controller.resolver.ErrorControllerResolver.LOGGER.debug("Resolving action to ErrorController::presentMissingControllerError");
        return org.rpwf.controller.ErrorController.class.getDeclaredMethod(ErrorController.MISSING_CONTROLLER_ACTION, org.rpwf.controller.ActionContext.class);
    } catch (java.lang.NoSuchMethodException e) {
        org.rpwf.controller.resolver.ErrorControllerResolver.LOGGER.error("Was not able to resolve to ErrorController", e);
        e.printStackTrace();
        return null;
    }
}