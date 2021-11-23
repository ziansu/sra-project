private static final <T extends zeldaswordskills.network.AbstractMessage<T>> void checkThreadAndEnqueue(final zeldaswordskills.network.AbstractMessage<T> msg, final net.minecraftforge.fml.common.network.simpleimpl.MessageContext ctx) {
    ZSSMain.proxy.getThreadFromContext(ctx).addScheduledTask(new java.lang.Runnable() {
        public void run() {
            msg.process(ZSSMain.proxy.getPlayerEntity(ctx), ctx.side);
        }
    });
}