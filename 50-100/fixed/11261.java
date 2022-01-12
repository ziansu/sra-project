public static void msgNearby(org.bukkit.entity.Player p, java.lang.String msg) {
    org.bukkit.entity.Entity en;
    label58 : for (java.util.Iterator localIterator = p.getNearbyEntities(48.0, 48.0, 48.0).iterator(); localIterator.hasNext(); ((org.bukkit.entity.Player) (en)).sendMessage(msg)) {
        en = ((org.bukkit.entity.Entity) (localIterator.next()));
        if ((!(en instanceof org.bukkit.entity.Player)) || (en == p))
            break label58;
        
    }
}