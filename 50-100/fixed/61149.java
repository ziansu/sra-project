public void playParticle(java.lang.String effectName, int data, int particles, int radius) {
    org.bukkit.entity.Player player = getPlayer();
    if ((player != null) && (effectName != null)) {
        org.bukkit.Particle effect = org.bukkit.Particle.valueOf(effectName);
        for (int i = 0; i < particles; i++) {
            player.getWorld().spawnParticle(effect, player.getLocation(), particles, radius, radius, radius, data);
        }
    }
}