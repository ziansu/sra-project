public static boolean isControlled(org.bukkit.entity.Player player) {
    for (org.bukkit.entity.Player p : com.projectkorra.ProjectKorra.earthbending.MetalClips.instances.keySet()) {
        if ((com.projectkorra.ProjectKorra.earthbending.MetalClips.instances.get(p).getTarget().getEntityId()) == (player.getEntityId())) {
            return true;
        }
    }
    return false;
}