public void done(android.view.View view) {
    java.util.LinkedList messages = databaseHelp.getMessages();
    updateScreen("Message List");
    for (int i = 0; i < (messages.size()); ++i) {
        updateScreen((((java.lang.String.valueOf(i)) + ":") + (messages.get(i))));
    }
    updateScreen("Message List Hash String");
    updateScreen(databaseHelp.getMessageListHash());
}