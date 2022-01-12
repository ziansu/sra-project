static boolean anyPlayers(org.bukkit.Location loc, int range) {
    java.util.List<org.bukkit.entity.Entity> out = me.badbones69.blockparticles.Api.getNearbyEntities(loc, range, range, range);
    if (!(out.isEmpty())) {
        for (org.bukkit.entity.Entity e : out) {
            if (e instanceof org.bukkit.entity.LivingEntity) {
                org.bukkit.entity.LivingEntity en = ((org.bukkit.entity.LivingEntity) (e));
                if (en instanceof org.bukkit.entity.Player) {
                    return true;
                }
            }
        }
    }
    return false;
}