@sx.blah.discord.api.events.EventSubscriber
public void onReadyEvent(sx.blah.discord.handle.impl.events.ReadyEvent event) {
    event.getClient().changeStatus(sx.blah.discord.handle.obj.Status.game((("~help | " + (java.lang.String.valueOf(event.getClient().getGuilds().size()))) + " Servers")));
    java.lang.System.out.println(("" + ((("Yo\n" + "His palms are sweaty, knees weak, arms are heavy\n") + "There\'s vomit on his sweater already, mom\'s spaghetti\n\n") + "Bot Ready")));
}