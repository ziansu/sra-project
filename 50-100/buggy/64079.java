@org.bukkit.event.EventHandler
public void onEvent(org.bukkit.event.block.BlockBreakEvent event) {
    if ((!(event.getPlayer().getItemInHand().containsEnchantment(org.bukkit.enchantments.Enchantment.getById(33)))) || (mp.getConfig().getStringList("track-placement").contains(event.getBlock().getType().name()))) {
        this.generalListener(event, event.getPlayer().getName());
    }
}