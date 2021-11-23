@java.lang.Override
public void run() {
    for (org.bukkit.entity.Player player : this.plugin.playersToCheck) {
        if (!(this.plugin.checkWorld(player.getWorld().getName()))) {
            player.sendMessage(("This world is currently restricted.\n" + (DimRestrictor.plugin.info(player.getWorld().getName()))));
            net.kaikk.mc.DimRestrictor.DimRestrictor.teleportPlayer(player, player.getLocation());
        }
        this.plugin.playersToCheck.remove(player);
    }
}