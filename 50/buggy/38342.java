@java.lang.Override
public final void close() {
    if (ctx.channel().isOpen())
        ctx.close();
    
    if ((actor) != null)
        actor.die(null);
    
}