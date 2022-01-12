@org.bukkit.event.EventHandler
public void Quit(org.bukkit.event.player.PlayerQuitEvent event) {
    org.bukkit.entity.Player player = event.getPlayer();
    if ((playerList) != null) {
        if (playerList.contains(player.getName())) {
            int index = playerList.indexOf(player.getName());
            playerList.remove(index);
            vectorBlock.remove(index);
        }
    }
}