@java.lang.Override
public void run() {
    web.MessageHolder.addHook(this);
    while (web.Chat.run) {
        java.lang.String input = ((myName) + ": ") + (key.nextLine());
        web.MessageHolder.AddMessageToSend(web.Message.MessageFactoryStringToB64(Message.typeEnum.Chat, input));
    } 
    web.MessageHolder.removeHook(this);
}