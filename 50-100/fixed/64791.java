public void hurt(org.bukkit.entity.Player target, org.bukkit.inventory.ItemStack i, org.bukkit.entity.Entity damager, double damage) {
    for (think.rpgitems.item.PowerHurt power : powerHurt) {
        power.hurt(target, i, damager, damage);
    }
    if ((getDurability(i)) <= 0) {
        i.setAmount(0);
        i.setType(Material.AIR);
    }
}