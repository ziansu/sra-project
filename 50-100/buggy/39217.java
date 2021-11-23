@java.lang.Override
@javax.annotation.Nullable
protected org.bukkit.OfflinePlayer[] get(org.bukkit.event.Event e) {
    java.util.UUID uuid = com.wasteofplastic.askyblock.ASkyBlockAPI.getInstance().getTeamLeader(player.getSingle(e).getUniqueId());
    if (uuid == null) {
        return null;
    }else {
        return new org.bukkit.OfflinePlayer[]{ fr.nashoba24.wolvsk.askyblock.fr.nashoba24.wolvsk.WolvSK.getInstance().getServer().getOfflinePlayer(uuid) };
    }
}