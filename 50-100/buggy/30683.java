@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void onBlockDestroy(net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent event) {
    if (((event.block) != null) && ((event.harvester) != null)) {
        net.minecraft.item.ItemStack block = new net.minecraft.item.ItemStack(event.block, 1, event.blockMetadata);
        for (ru.lionzxy.damagetweaker.DropsObject dropsObject : DropsObject.dropsObj)
            if (dropsObject.isBlockEqual(block)) {
                event.drops.clear();
                dropsObject.replaceDrop(event.drops, event.harvester.getCurrentEquippedItem());
            }
        
    }
}