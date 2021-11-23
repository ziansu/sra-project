@cpw.mods.fml.common.Mod.EventHandler
public void serverStopping(cpw.mods.fml.common.event.FMLServerStoppingEvent event) {
    for (radixcore.data.AbstractPlayerData data : mca.core.MCA.playerDataMap.values()) {
        data.saveDataToFile();
    }
    mca.core.MCA.playerDataMap.clear();
}