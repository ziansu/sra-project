public void connectToServer() {
    controller.game.NetworkNiftyController.logger.info("connect to Server was clicked");
    de.lessvoid.nifty.controls.TextField textField = nifty.getCurrentScreen().findNiftyControl("serveradress", de.lessvoid.nifty.controls.TextField.class);
    java.lang.String textValue = textField.getRealText();
}