@java.lang.Override
public void startupEvent() {
    MinecraftForge.EVENT_BUS.register(new raintotalwar.render.RenderGlobalEffect());
    MinecraftForge.EVENT_BUS.register(new raintotalwar.ui.overlay.UserOverlay());
    MinecraftForge.EVENT_BUS.register(new raintotalwar.event.SniperScope());
}