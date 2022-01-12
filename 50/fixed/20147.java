public void scheduleTaskBasedOnContext(net.minecraftforge.fml.common.network.simpleimpl.MessageContext ctx, java.lang.Runnable task) {
    if (ctx.side.isClient()) {
        net.minecraft.client.Minecraft.getMinecraft().addScheduledTask(task);
    }else {
        super.scheduleTaskBasedOnContext(ctx, task);
    }
}