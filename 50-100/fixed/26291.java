public static void load(net.minecraftforge.fml.common.event.FMLServerStartingEvent event) {
    net.minecraft.world.storage.MapStorage storage = event.getServer().getEntityWorld().getMapStorage();
    factionmod.data.InventoryData data = ((factionmod.data.InventoryData) (storage.getOrLoadData(factionmod.data.InventoryData.class, factionmod.data.InventoryData.NAME)));
    if (data == null) {
        data = new factionmod.data.InventoryData(factionmod.data.InventoryData.NAME);
        storage.setData(factionmod.data.InventoryData.NAME, data);
    }
    factionmod.data.InventoryData.SAVE = data;
}