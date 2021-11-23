public final void postInit() {
    if (cpw.mods.fml.common.Loader.isModLoaded("MineTweaker3"))
        wanion.biggercraftingtables.minetweaker.Tweaker.init();
    
    if (cpw.mods.fml.common.Loader.isModLoaded("NotEnoughItems"))
        wanion.biggercraftingtables.nei.NEI.init();
    
}