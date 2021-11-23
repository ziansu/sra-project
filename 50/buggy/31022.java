@java.lang.Override
public java.lang.Boolean call() throws java.lang.Exception {
    return (ctx.objects.peek().inViewport()) && ((andyroo.blastfurnace.BlastFurnace.BELT_TILE.distanceTo(ctx.objects.peek())) < 5);
}