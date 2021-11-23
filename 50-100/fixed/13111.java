@java.lang.Override
public boolean onMessage(net.dv8tion.jda.core.entities.User user, net.dv8tion.jda.core.entities.Message message, net.dv8tion.jda.core.entities.MessageChannel channel, boolean isPrivate, java.lang.String[] args) {
    if (!(super.onMessage(user, message, channel, isPrivate, args)))
        return false;
    
    new de.kitt3120.viperbot.objects.MessageBuilder(channel).append("Restarting").send();
    de.kitt3120.viperbot.Core.stop();
    return true;
}