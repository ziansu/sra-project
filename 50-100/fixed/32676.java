public void registerEventHandler() {
    MinecraftForge.EVENT_BUS.register(new oortcloud.hungryanimals.core.handler.WorldEventHandler());
    MinecraftForge.EVENT_BUS.register(new oortcloud.hungryanimals.configuration.ConfigurationEventHandler());
    MinecraftForge.EVENT_BUS.register(new oortcloud.hungryanimals.entities.event.EntityEventHandler());
    MinecraftForge.EVENT_BUS.register(new oortcloud.hungryanimals.recipes.event.CraftingEventHandler());
    MinecraftForge.EVENT_BUS.register(new oortcloud.hungryanimals.entities.capability.CapabilityHandler());
    MinecraftForge.EVENT_BUS.register(new oortcloud.hungryanimals.entities.loot_tables.LootTableModifier());
}