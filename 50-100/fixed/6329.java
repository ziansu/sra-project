public static void registerAddon(mcp.mobius.waila.api.IWailaRegistrar register) {
    net.darkhax.wawla.addons.vanillamc.AddonVanillaEntities dataProvider = new net.darkhax.wawla.addons.vanillamc.AddonVanillaEntities();
    register.registerBodyProvider(dataProvider, net.minecraft.entity.passive.EntityHorse.class);
    register.registerNBTProvider(dataProvider, net.minecraft.entity.passive.EntityHorse.class);
    register.registerBodyProvider(dataProvider, net.minecraft.entity.passive.EntityVillager.class);
    register.registerNBTProvider(dataProvider, net.minecraft.entity.passive.EntityVillager.class);
}