public void run() {
    m.teleport(l.getLocation().add(java.lang.Math.random(), java.lang.Math.random(), java.lang.Math.random()));
    l.addPotionEffect(new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.SLOW, (20 * 5), 7));
    l.addPotionEffect(new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.BLINDNESS, (20 * 1), 7));
    chasing = false;
}