@java.lang.Override
public void onReceive(java.lang.Object message) throws java.lang.Exception {
    switch (message.getClass().getSimpleName()) {
        case "ChatMessage" :
            chat.ChatMessage chatMessage = chat.ChatMessage.class.cast(message);
            publishChat(chatMessage);
            break;
        default :
            unhandled(message);
    }
}