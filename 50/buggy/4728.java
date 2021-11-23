public static som.interpreter.actors.SPromise.SResolver createResolver(final som.interpreter.actors.SPromise promise, final java.lang.String debugNote) {
    if (som.vm.VmSettings.DEBUG_MODE) {
        return new som.interpreter.actors.SPromise.SDebugResolver(promise, debugNote);
    }else {
        return new som.interpreter.actors.SPromise.SResolver(promise);
    }
}