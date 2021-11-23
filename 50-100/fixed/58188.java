public void flames(org.bukkit.Location location) {
    for (int x = 0; x < (mc.adambor.ArenaPlunger.ArenaPlunger.count); x++) {
        org.bukkit.Location loc = location.clone();
        loc = loc.add(((rand.nextDouble()) - 0.5), ((rand.nextDouble()) - 0.5), ((rand.nextDouble()) - 0.5));
        location.getWorld().playEffect(loc, mc.adambor.ArenaPlunger.ArenaPlunger.effect, 10);
    }
}