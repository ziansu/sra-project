@java.lang.Override
protected boolean isNumberValid(org.bukkit.conversations.ConversationContext context, java.lang.Number input) {
    return ((input.intValue()) > 0) && ((input.intValue()) <= 20);
}