@latmod.emcc.Mod.EventHandler
public void postInit(latmod.emcc.FMLPostInitializationEvent e) {
    latmod.ftbu.core.event.CustomAction.register(latmod.emcc.EMCC.MOD_ID, EMCCNetHandler.instance);
    latmod.emcc.EMCC.mod.loadRecipes();
    latmod.emcc.emc.EMCHandler.instance().loadRecipes();
}