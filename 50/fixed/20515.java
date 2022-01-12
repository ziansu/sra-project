public cz.cuni.amis.pogamut.sposh.executor.ActionResult run() {
    if ((ctx.targetPlayer) != (ctx.teamTargetPlayer)) {
        ctx.SendMarkPlayer(ctx.targetPlayer.getId());
        ctx.teamTargetPlayer = ctx.targetPlayer;
    }
    return cz.cuni.amis.pogamut.sposh.executor.ActionResult.FINISHED;
}