@org.bukkit.event.EventHandler
public void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent event) {
    java.lang.String player = event.getPlayer().getUniqueId().toString();
    if ((data.get(player)) == null) {
        data.set((player + ".Smithing.Level"), 1);
        data.set((player + ".Smithing.XP"), 0);
        data.set((player + ".Mining.Level"), 1);
        data.set((player + ".Mining.XP"), 0);
        save();
    }
}