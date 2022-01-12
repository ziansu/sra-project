@java.lang.Override
public void setupTerrain(net.minecraft.entity.Entity viewEntity, double ticks, net.minecraft.client.renderer.culling.ICamera camera, int frameCount, boolean spectator) {
    if (((me.dags.daflight.DaFlight.get().DFController.noClipOn) && (me.dags.daflight.DaFlight.get().DFController.flyModOn)) && (me.dags.daflight.DaFlight.getMC().getPlayer().capabilities.isCreativeMode)) {
        spectator = true;
    }
    super.setupTerrain(viewEntity, ticks, camera, frameCount, spectator);
}