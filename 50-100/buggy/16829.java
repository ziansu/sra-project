public play.mvc.Result sendSampleMessage() {
    controllers.MessageViewer.logger.info("=> Send Sample Messages");
    ch.helin.messages.experimental.MySimpleMessage mySimpleMessage = new ch.helin.messages.experimental.MySimpleMessage();
    commons.MessageConnection messageConnection = new commons.MessageConnection();
    messageConnection.sendMessage(("Hello Buddy, time is " + (java.lang.System.currentTimeMillis())));
    messageConnection.closeConnection();
    return ok(messageviewer.render());
}