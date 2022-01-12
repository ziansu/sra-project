@java.lang.Override
public void onReceive(java.lang.Object message) throws java.lang.Exception {
    switch (message.getClass().getSimpleName()) {
        case "TopicMessage" :
            chat.Publisher.log.error("I cannot handle topic messages!");
            break;
        case "ChatMessage" :
            chat.ChatMessage chatMessage = chat.ChatMessage.class.cast(message);
            publishChat(chatMessage);
            break;
        default :
            unhandled(message);
    }
}