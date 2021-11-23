@java.lang.Override
public boolean isRenter(org.bukkit.OfflinePlayer player) {
    if ((getRenter()) == null)
        return false;
    
    if (getRenter().isPlayer()) {
        return getRenter().getUniqueId().equals(player.getUniqueId());
    }else {
        return ((com.kylantraynor.civilizations.groups.Group) (getRenter())).isMember(player);
    }
}