public static com.bluelinelabs.conductor.RouterTransaction getRouterTransaction(int index, com.bluelinelabs.conductor.Controller fromController) {
    com.bluelinelabs.conductor.demo.controllers.TransitionDemoController toController = new com.bluelinelabs.conductor.demo.controllers.TransitionDemoController(index);
    com.bluelinelabs.conductor.ControllerChangeHandler changeHandler = toController.getChangeHandler(fromController);
    return com.bluelinelabs.conductor.RouterTransaction.with(toController).pushChangeHandler(changeHandler).popChangeHandler(changeHandler);
}