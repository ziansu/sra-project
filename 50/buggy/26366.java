@java.lang.Override
public net.dv8tion.jda.core.entities.impl.RestAction<net.dv8tion.jda.core.entities.impl.Message> sendMessage(java.lang.String text) {
    return sendMessage(new net.dv8tion.jda.core.MessageBuilder().appendString(text).build());
}