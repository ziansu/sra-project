@java.lang.Override
public com.wincom.dcim.agentd.statemachine.State enter(com.wincom.dcim.agentd.primitives.HandlerContext ctx) {
    ctx.getHandler(message.getClass()).handle(ctx, message);
    return this;
}