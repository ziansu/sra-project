@java.lang.Override
public LoopController.Command doLoopControl(skadistats.clarity.processor.runner.Context ctx, int upcomingTick) {
    if (upcomingTick != (tick)) {
        if (upcomingTick != (java.lang.Integer.MAX_VALUE)) {
            endTicksUntil(ctx, (upcomingTick - 1));
            startNewTick(ctx, upcomingTick);
        }else {
            endTicksUntil(ctx, tick);
        }
    }
    return LoopController.Command.FALLTHROUGH;
}