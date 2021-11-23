public void preinit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    com.himself12794.powersapi.network.PowersNetwork.init(NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MODID));
    com.himself12794.powersapi.network.PowersNetwork.registerMessages();
    if (com.himself12794.powersapi.config.Config.enablePowerActivator) {
        com.himself12794.powersapi.ModCreativeTabs.addCreativeTabs();
        com.himself12794.powersapi.item.ModItems.addItems();
    }
    net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(com.himself12794.powersapi.entity.EntityPower.class, "power", 1, PowersAPI.instance, 80, 3, true);
    com.himself12794.powersapi.storage.PropertiesManager.registerPropertyClass(com.himself12794.powersapi.storage.EffectsEntity.class, net.minecraft.entity.EntityLivingBase.class);
    com.himself12794.powersapi.storage.PropertiesManager.registerPropertyClass(com.himself12794.powersapi.storage.PowersEntity.class, net.minecraft.entity.EntityLivingBase.class);
}