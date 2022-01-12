public void EntityDeathHelper(org.bukkit.event.entity.EntityDeathEvent event, int damage, java.lang.Double droprate) {
    java.lang.Double dropchance = prng.nextDouble();
    org.bukkit.entity.Player killer = event.getEntity().getKiller();
    if (dropchance >= droprate) {
        return ;
    }
    if ((plugin.configFile.getBoolean("mobpkonly", true)) && ((killer == null) || (!(killer.hasPermission("playerheads.canbeheadmob"))))) {
        return ;
    }
    event.getDrops().add(org.shininet.bukkit.playerheads.Skull.getItemStack(damage));
}