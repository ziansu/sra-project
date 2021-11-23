@java.lang.Override
public boolean onSubmit(java.lang.CharSequence input) {
    final java.lang.String inputText = input.toString().trim();
    final ai.vernacular.ui.ChatKitMessage msg = new ai.vernacular.ui.ChatKitMessage(endUser, inputText, new java.util.Date(), IncomingMessage.MessageTypes.freeText);
    adapter.addToStart(msg, true);
    new ai.vernacular.ui.VernacularChatActivity.SaveToDB(ai.vernacular.db.MessageDbModel.USER, msg).run();
    ai.vernacular.model.OutgoingMessage outgoingMessage = new ai.vernacular.model.OutgoingMessage(ai.vernacular.model.OutgoingMessage.freeText, inputText);
    sendMessageToServer(outgoingMessage);
    return true;
}