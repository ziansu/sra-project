public long createTeam(org.bukkit.entity.Player p) {
    java.util.ArrayList<org.bukkit.entity.Player> group = new java.util.ArrayList<org.bukkit.entity.Player>();
    group.add(p);
    return createTeam(group);
}