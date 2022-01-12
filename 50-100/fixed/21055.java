@java.lang.Override
public void process(final net.minecraft.world.World world, final net.minecraft.entity.player.EntityPlayer player) {
    org.blockartistry.mod.DynSurround.client.handlers.EnvironStateHandler.EnvironState.tick(world, player);
    if (net.minecraft.client.Minecraft.getMinecraft().gameSettings.showDebugInfo) {
        final org.blockartistry.mod.DynSurround.client.event.DiagnosticEvent.Gather gather = new org.blockartistry.mod.DynSurround.client.event.DiagnosticEvent.Gather(world, player);
        MinecraftForge.EVENT_BUS.post(gather);
        org.blockartistry.mod.DynSurround.client.handlers.EnvironStateHandler.diagnostics = gather.output;
    }else {
        org.blockartistry.mod.DynSurround.client.handlers.EnvironStateHandler.diagnostics = null;
    }
}