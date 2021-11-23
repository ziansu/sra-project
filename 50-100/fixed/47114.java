public void removePlayer(org.bukkit.OfflinePlayer player, boolean silent) {
    org.apache.commons.lang.Validate.notNull(player, "The player cannot be null.");
    players.remove(player.getUniqueId());
    unregisterPlayer(player);
    if (player.isOnline()) {
        if (!silent)
            ((org.bukkit.entity.Player) (player)).sendMessage(fr.zcraft.zlib.components.i18n.I.t("{darkaqua}You are no longer part of the {0}{darkaqua} team.", getDisplayName()));
        
        if (UHConfig.BEFORE_START.TEAM_IN_ACTION_BAR.get())
            fr.zcraft.zlib.tools.text.ActionBar.removeMessage(((org.bukkit.entity.Player) (player)), true);
        
    }
}