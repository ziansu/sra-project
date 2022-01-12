@java.lang.Override
public void run() {
    web.MessageHolder.addHook(this);
    java.util.Scanner key = new java.util.Scanner(java.lang.System.in);
    while (web.Chat.run) {
        if (key.hasNextLine()) {
            java.lang.String input = ((myName) + ": ") + (key.nextLine());
            web.MessageHolder.AddMessageToSend(web.Message.MessageFactoryStringToB64(Message.typeEnum.Chat, input));
        }
    } 
    key.close();
    web.MessageHolder.removeHook(this);
}