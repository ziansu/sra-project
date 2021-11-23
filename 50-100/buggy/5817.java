public static som.interpreter.actors.SPromise createPromise(final som.interpreter.actors.Actor owner, final boolean triggerPromiseResolverBreakpoint, final boolean triggerPromiseResolutionBreakpoint, final boolean explicitPromise) {
    if (som.vm.VmSettings.DEBUG_MODE) {
        return new som.interpreter.actors.SPromise.SDebugPromise(owner);
    }else
        if (som.vm.VmSettings.PROMISE_CREATION) {
            return new som.interpreter.actors.SPromise.STracingPromise(owner);
        }else {
            return new som.interpreter.actors.SPromise(owner, triggerPromiseResolverBreakpoint, triggerPromiseResolutionBreakpoint, explicitPromise);
        }
    
}