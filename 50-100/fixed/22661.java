@java.lang.Override
public void invoke(java.util.List<java.lang.String> args) {
    final java.lang.String name = args.get(0);
    args.remove(0);
    if ((name.length()) > 0) {
        final codeu.chat.client.core.ConversationContext conversation = user.start(name);
        if (conversation == null) {
            java.lang.System.out.println("ERROR: Failed to create new conversation");
        }else {
            panels.push(createConversationPanel(conversation));
        }
    }else {
        java.lang.System.out.println("ERROR: Missing <title>");
    }
}