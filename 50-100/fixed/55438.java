@org.bukkit.event.EventHandler
public final void onPlayerTeleport(final org.bukkit.event.player.PlayerTeleportEvent event) {
    final me.NoChance.PvPManager.PvPlayer player = ph.get(event.getPlayer());
    if (((player != null) && (me.NoChance.PvPManager.Config.Variables.isInCombatEnabled())) && (player.isInCombat())) {
        if ((event.getCause().equals(TeleportCause.ENDER_PEARL)) && (me.NoChance.PvPManager.Config.Variables.isBlockEnderPearl())) {
            event.setCancelled(true);
            player.message(me.NoChance.PvPManager.Config.Messages.getEnderpearlBlockedIncombat());
        }
    }
}