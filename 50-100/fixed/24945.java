private void updateTarget(org.bukkit.entity.Player player) {
    if ((target) == null)
        return ;
    
    if (!(target.getWorld().getName().equalsIgnoreCase(player.getWorld().getName())))
        return ;
    
    this.setScore(player, (-(java.lang.Double.valueOf(player.getLocation().distance(target)).intValue())));
}