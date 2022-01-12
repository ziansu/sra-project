public static org.bukkit.entity.EntityType fromName(java.lang.String name) {
    if (name == null) {
        return null;
    }
    return org.bukkit.entity.EntityType.NAME_MAP.get(name.toLowerCase());
}