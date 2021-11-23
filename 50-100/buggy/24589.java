@org.bukkit.event.EventHandler
public void onPlayerRightClickBlock(org.bukkit.event.player.PlayerInteractEvent event) {
    org.bukkit.entity.Player player = event.getPlayer();
    org.bukkit.block.Block clickedBlock = event.getClickedBlock();
    if ((event.getAction()) == (Action.RIGHT_CLICK_BLOCK)) {
        me.newyith.generator.FortressGeneratorRunesManager.onPlayerRightClickBlock(player, clickedBlock);
    }
}