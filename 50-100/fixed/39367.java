public void add(java.lang.String uuid, boolean registered) {
    com.lenis0012.bukkit.ls.thread.Timeout.TimeoutData current = new com.lenis0012.bukkit.ls.thread.Timeout.TimeoutData(uuid, registered);
    notify(current);
    org.bukkit.entity.Player player = org.bukkit.Bukkit.getPlayer(java.util.UUID.fromString(uuid));
    if ((player != null) && (player.isOnline())) {
        player.addPotionEffect(new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.BLINDNESS, java.lang.Integer.MAX_VALUE, 1), true);
    }
    authList.putIfAbsent(uuid, current);
}