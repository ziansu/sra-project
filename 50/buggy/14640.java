@java.lang.Override
public void onClick(android.view.View view) {
    getChatMessages();
    sendMessages();
    handler.post(timedTask);
}