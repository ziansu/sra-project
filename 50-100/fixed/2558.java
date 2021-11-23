@java.lang.Override
public net.minecraftforge.fml.common.network.simpleimpl.IMessage onMessage(T message, net.minecraftforge.fml.common.network.simpleimpl.MessageContext ctx) {
    if (ctx.side.isClient()) {
        return handleClientMessage(ctx.getServerHandler().playerEntity, message, ctx);
    }else {
        return handleServerMessage(ctx.getServerHandler().playerEntity, message, ctx);
    }
}