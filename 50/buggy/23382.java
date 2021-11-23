@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void onConfigChanged(cpw.mods.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent event) {
    if (event.modID.equals("Mekanism")) {
        mekanism.common.Mekanism.proxy.loadConfiguration();
        mekanism.common.Mekanism.proxy.onConfigSync();
    }
}