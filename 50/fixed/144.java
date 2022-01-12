@latmod.emcc.Mod.EventHandler
public void postInit(latmod.emcc.FMLPostInitializationEvent e) {
    latmod.emcc.EMCC.mod.loadRecipes();
    latmod.emcc.emc.EMCHandler.instance().loadRecipes();
}