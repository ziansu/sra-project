@cpw.mods.fml.common.Mod.EventHandler
public void init(vdvman1.betterAnvil.FMLInitializationEvent event) {
    try {
        cpw.mods.fml.common.registry.GameRegistry.addSubstitutionAlias("minecraft:anvil", Type.BLOCK, vdvman1.betterAnvil.BetterAnvil.ANVIL);
        cpw.mods.fml.common.registry.GameRegistry.addSubstitutionAlias("minecraft:anvil", Type.ITEM, new net.minecraft.item.ItemAnvilBlock(vdvman1.betterAnvil.BetterAnvil.ANVIL));
    } catch (cpw.mods.fml.common.registry.ExistingSubstitutionException e) {
        e.printStackTrace();
    }
    MinecraftForge.EVENT_BUS.register(EventHandlerBA.INSTANCE);
    NetworkRegistry.INSTANCE.registerGuiHandler(vdvman1.betterAnvil.BetterAnvil.instance, new vdvman1.betterAnvil.gui.GuiHandler());
}