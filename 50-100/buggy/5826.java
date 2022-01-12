@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void reloadTheme(net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent event) {
    if (((tickCount) % 40) == 0) {
        try {
            java.lang.String tempFileNameStorage = AdvancedXP.instance.theme.fileName;
            AdvancedXP.instance.theme = co.bugg.advancedxp.util.FileUtil.deserializeTheme(new java.io.File(((AdvancedXP.instance.themesPath) + tempFileNameStorage)));
            AdvancedXP.instance.theme.fileName = tempFileNameStorage;
        } catch (java.io.IOException e) {
            java.lang.System.out.println("Failed to reload theme.");
            e.printStackTrace();
        }
    }
}