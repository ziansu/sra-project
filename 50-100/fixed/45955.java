@java.lang.Override
public void invoke(java.util.List<java.lang.String> args) {
    for (java.lang.String token : args) {
        final java.lang.String title = token;
        if ((title.length()) > 0) {
            final codeu.chat.client.core.ConversationContext conversation = find(title);
            if (conversation == null) {
                java.lang.System.out.format("ERROR: No conversation with name \'%s\'\n", title);
            }else {
                user.addConversationInterest(title);
            }
        }else {
            java.lang.System.out.println("ERROR: Missing <title>");
        }
    }
}