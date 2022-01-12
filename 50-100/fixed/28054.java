@java.lang.Override
public void onEnable() {
    getServer().getPluginManager().registerEvents(this, this);
    initialiseNotifications();
    try {
        mineTwit.Main.twitter = setupTwitter();
        updateStatus(mineTwit.Main.twitter, mineTwit.Main.entryMessage);
    } catch (twitter4j.TwitterException e) {
        getLogger().info(("Twitter is broken because of " + e));
    } finally {
        getLogger().info("mineTwit goes tweet tweet");
    }
}