@java.lang.Override
public boolean activate() {
    return (((ctx.inventory.select().count()) == 0) && (!(chaosTower.contains(ctx.players.local())))) || ((ctx.inventory.select().count()) == 28);
}