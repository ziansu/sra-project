@java.lang.Override
public boolean onMessage(net.dv8tion.jda.core.entities.User user, net.dv8tion.jda.core.entities.Message message, net.dv8tion.jda.core.entities.MessageChannel channel, boolean isPrivate, java.lang.String[] args) {
    if (!(super.onMessage(user, message, channel, isPrivate, args)))
        return false;
    
    new de.kitt3120.viperbot.objects.MessageBuilder(channel).append("Restarting").send();
    java.util.concurrent.Executors.newSingleThreadScheduledExecutor().schedule(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            de.kitt3120.viperbot.Core.stop();
        }
    }, 1, java.util.concurrent.TimeUnit.SECONDS);
    return true;
}