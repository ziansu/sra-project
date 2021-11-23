@sx.blah.discord.api.events.EventSubscriber
public void onReady(sx.blah.discord.handle.impl.events.ReadyEvent event) {
    super.onReady(event);
    readChannelNames();
    for (sx.blah.discord.handle.obj.IGuild guild : client.getGuilds()) {
        de.maxkroner.implementation.privateBot.TempChannelMap tempChannelMap = new de.maxkroner.implementation.privateBot.TempChannelMap();
        de.maxkroner.implementation.privateBot.PrivateBot.tempChannelsByGuild.put(guild, tempChannelMap);
    }
    java.util.concurrent.ScheduledExecutorService executor = java.util.concurrent.Executors.newScheduledThreadPool(1);
    de.maxkroner.implementation.privateBot.CheckTempChannel<java.lang.Runnable> checkEvent = new de.maxkroner.implementation.privateBot.CheckTempChannel<java.lang.Runnable>(de.maxkroner.implementation.privateBot.PrivateBot.tempChannelsByGuild, executor);
    executor.scheduleAtFixedRate(checkEvent, 10, 10, java.util.concurrent.TimeUnit.MINUTES);
}