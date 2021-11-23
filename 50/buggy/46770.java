public int getLevel(org.bukkit.Material type) {
    return levels.containsKey(type.name().toLowerCase()) ? levels.get(type.name().toLowerCase()) : 0;
}