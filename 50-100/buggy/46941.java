public static void preInit() {
    MinecraftForge.EVENT_BUS.register(ModItems.orb_of_sin);
    MinecraftForge.EVENT_BUS.register(ModItems.super_fluffy_boots);
    MinecraftForge.EVENT_BUS.register(ModItems.super_fluffy_chestplate);
    MinecraftForge.EVENT_BUS.register(ModItems.amulet_tepeport);
    MinecraftForge.EVENT_BUS.register(ModItems.amulet_magnetic);
    MinecraftForge.EVENT_BUS.register(ModItems.amulet_potion);
    MinecraftForge.EVENT_BUS.register(new cabralrodrigo.mc.mods.jarm.common.registry.ModRecipes());
    MinecraftForge.EVENT_BUS.register(new cabralrodrigo.mc.mods.jarm.common.handler.EventHandlerItemFood());
    MinecraftForge.EVENT_BUS.register(cabralrodrigo.mc.mods.jarm.common.crafting.explosion.ExplosionCraftingManager.instance());
}