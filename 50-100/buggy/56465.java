private static final <T extends zeldaswordskills.network.AbstractMessage<T>> void checkThreadAndEnqueue(final zeldaswordskills.network.AbstractMessage<T> msg, final net.minecraftforge.fml.common.network.simpleimpl.MessageContext ctx) {
    net.minecraft.util.IThreadListener thread = ZSSMain.proxy.getThreadFromContext(ctx);
    if (!(thread.isCallingFromMinecraftThread())) {
        thread.addScheduledTask(new java.lang.Runnable() {
            public void run() {
                msg.process(ZSSMain.proxy.getPlayerEntity(ctx), ctx.side);
            }
        });
    }
}