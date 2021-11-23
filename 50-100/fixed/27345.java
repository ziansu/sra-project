@java.lang.Override
public void onClick(android.view.View v) {
    com.bluelinelabs.conductor.RouterTransaction transaction = com.bluelinelabs.conductor.RouterTransaction.with(new com.bluelinelabs.conductor.demo.controllers.TextController(java.lang.String.format("DIALOG Next from %s", getArgs().getString(com.bluelinelabs.conductor.demo.controllers.ChildController.KEY_TITLE)), true)).pushChangeHandler(new com.bluelinelabs.conductor.demo.changehandler.FadeInChangeHandler()).popChangeHandler(new com.bluelinelabs.conductor.demo.changehandler.FadeOutChangeHandler());
    getRouter().pushController(transaction);
}