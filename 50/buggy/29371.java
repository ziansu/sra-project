@org.bukkit.event.EventHandler
public void onQuestModify(me.mrCookieSlime.QuestWorld.events.QuestChangeEvent e) {
    org.bukkit.Bukkit.getLogger().info(("Changing: " + (e.getNextState().getChanges().toString())));
    if ((java.lang.Math.random()) > 0.6) {
    }
}