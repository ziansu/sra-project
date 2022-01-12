@org.bukkit.event.EventHandler
public void onPlayerRightClickBlock(org.bukkit.event.player.PlayerInteractEvent event) {
    if ((event.getAction()) == (Action.RIGHT_CLICK_BLOCK)) {
        org.bukkit.entity.Player player = event.getPlayer();
        org.bukkit.block.Block clickedBlock = event.getClickedBlock();
        me.newyith.generator.FortressGeneratorRunesManager.onPlayerRightClickBlock(player, clickedBlock);
    }
}