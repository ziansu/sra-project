@net.minecraftforge.fml.common.Mod.EventHandler
public void postInit(net.minecraftforge.fml.common.event.FMLPostInitializationEvent event) {
    net.silentchaos512.lib.debug.DataDump.dumpEntityList();
    net.silentchaos512.lib.debug.DataDump.dumpEnchantments();
    net.silentchaos512.lib.debug.DataDump.dumpPotionEffects();
}