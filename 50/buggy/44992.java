@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public void unwind(org.spongepowered.common.event.tracking.UnwindingPhaseContext context) {
    final org.spongepowered.common.event.tracking.IPhaseState unwindingState = context.getUnwindingState();
    final org.spongepowered.common.event.tracking.PhaseContext<?> unwindingContext = context.getUnwindingContext();
    unwindingState.unwind(unwindingContext);
    this.postDispatch(unwindingState, unwindingContext, context);
}