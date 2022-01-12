public int getLevel(org.bukkit.Material type) {
    return (type != null) && (levels.containsKey(type.name().toLowerCase())) ? levels.get(type.name().toLowerCase()) : 0;
}