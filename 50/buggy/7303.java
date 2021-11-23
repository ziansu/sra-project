@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onWorldUnload(net.minecraftforge.event.world.WorldEvent.Unload e) {
    try {
        file.saveAll();
    } catch (java.io.IOException e1) {
        java.lang.System.out.println("Failed to save file! IOException");
    }
    global.worldIsLoaded = false;
}