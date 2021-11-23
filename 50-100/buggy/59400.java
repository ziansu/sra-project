@java.lang.Override
public final cpw.mods.fml.common.network.simpleimpl.IMessage onMessage(T msg, cpw.mods.fml.common.network.simpleimpl.MessageContext ctx) {
    if (!(isValidOnSide(ctx.side))) {
        throw new java.lang.RuntimeException(((("Invalid side " + (ctx.side.name())) + " for ") + (msg.getClass().getSimpleName())));
    }
    msg.process(ZSSMain.proxy.getPlayerEntity(ctx), ctx.side);
    return null;
}