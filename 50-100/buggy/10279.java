@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public static void playerSettings(com.feed_the_beast.ftbl.api.events.player.ForgePlayerConfigEvent event) {
    com.latmod.modularpipes.data.ModularPipesPlayerData data = ((com.latmod.modularpipes.data.ModularPipesPlayerData) (event.getPlayer().getData(ModularPipesPlayerData.ID)));
    if (data != null) {
        event.getConfig().setGroupName(ModularPipes.MOD_ID, new net.minecraft.util.text.TextComponentString(ModularPipes.MOD_NAME));
        event.getConfig().add(ModularPipes.MOD_ID, "dev_mode", data.devMode).setNameLangKey("modularpipes.config.general.dev_mode");
    }
}