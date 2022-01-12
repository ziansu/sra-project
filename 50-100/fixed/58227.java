protected void onTickInGUI(net.minecraft.world.World[] worlds, cpw.mods.fml.relauncher.Side side) {
    if ((this.isLoaded) && ((worlds.length) == 0)) {
        this.isLoaded = false;
        cpw.mods.fml.common.FMLCommonHandler.instance().bus().post(new com.missingeye.pixelpainter.events.WorldUnloadedEvent());
    }
}