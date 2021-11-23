@net.minecraftforge.fml.common.Mod.EventHandler
public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    fi.dy.masa.minecraft.mods.multishot.Multishot.instance = this;
    fi.dy.masa.minecraft.mods.multishot.Multishot.logger = event.getModLog();
    new fi.dy.masa.minecraft.mods.multishot.config.Configs(event.getModConfigurationDirectory());
    fi.dy.masa.minecraft.mods.multishot.Multishot.proxy.preInit();
}