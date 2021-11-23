@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onWorldTick(net.minecraftforge.fml.common.gameevent.TickEvent.WorldTickEvent event) {
    if (CppConfigHandler.enableAutoSeedPlanting) {
        net.minecraft.world.World world = event.world;
        java.util.List<net.minecraft.entity.item.EntityItem> entityItemList = world.getEntities(net.minecraft.entity.item.EntityItem.class, IEntitySelector.selectAnything);
        for (net.minecraft.entity.item.EntityItem entityItem : entityItemList) {
            net.minecraft.item.ItemStack itemstack = entityItem.getEntityItem();
            if ((itemstack != null) && ((itemstack.getItem()) instanceof net.minecraft.item.ItemSeeds))
                io.github.anon10w1z.craftPP.misc.CppExtendedEntityProperties.getExtendedProperties(entityItem).handlePlantingLogic();
            
        }
    }
}