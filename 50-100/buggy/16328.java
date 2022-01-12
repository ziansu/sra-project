protected void sendMessage(central.Component recipient, org.json.JSONObject msg, java.util.function.Consumer<org.json.JSONObject> onAnswer) throws java.lang.InterruptedException {
    central.Message message = new central.Message(componentType, recipient, msg.toString(), 0);
    central.newMessage(message);
    if ((recipient == (Component.ANY)) && (onAnswer != null)) {
        central.ExceptionHandler.showErrorDialog(new java.lang.Exception("Messages with multiple recipients and answer callbacks are not allowed!"));
        onAnswer = null;
    }
    if (onAnswer != null) {
        this.answerCallbacks.put(message.id, onAnswer);
    }
}