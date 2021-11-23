public static me.isach.ultracosmetics.CustomPlayer getCustomPlayer(org.bukkit.entity.Player player) {
    try {
        for (me.isach.ultracosmetics.CustomPlayer cp : me.isach.ultracosmetics.Core.customPlayers)
            if (cp.getPlayer().getName().equals(player.getName()))
                return cp;
            
        
        return new me.isach.ultracosmetics.CustomPlayer(player.getUniqueId());
    } catch (java.lang.NullPointerException exception) {
        me.isach.ultracosmetics.Core.customPlayers.add(new me.isach.ultracosmetics.CustomPlayer(player.getUniqueId()));
        return me.isach.ultracosmetics.Core.getCustomPlayer(player);
    }
}