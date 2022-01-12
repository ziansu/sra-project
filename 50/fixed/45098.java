@java.lang.Override
public java.lang.String generateMapKey(org.bukkit.entity.Player p) {
    if (this.useUUID) {
        return p.getUniqueId().toString();
    }else {
        return p.getName().toLowerCase();
    }
}