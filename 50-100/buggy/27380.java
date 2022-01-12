@org.bukkit.event.EventHandler
public void ON_LOGOUT(org.bukkit.event.player.PlayerQuitEvent event) {
    org.bukkit.Bukkit.getServer().broadcastMessage("Nigger");
    org.bukkit.entity.Player player = event.getPlayer();
    if ((com.gmail.garnetyeates.launchpads.LaunchPad.whatPadAmIEditing(player)) != null) {
        com.gmail.garnetyeates.launchpads.LaunchPad pad = com.gmail.garnetyeates.launchpads.LaunchPad.whatPadAmIEditing(player);
        if ((pad.getLaunchLocation()) == null) {
            pad.terminate();
        }else {
            pad.stopEditing();
        }
    }
}