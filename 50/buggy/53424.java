public static som.interpreter.actors.SPromise.SResolver createResolver(final som.interpreter.actors.SPromise promise, final java.lang.String debugNote) {
    if (som.VM.DebugMode) {
        return new som.interpreter.actors.SPromise.SResolver(promise);
    }else {
        return new som.interpreter.actors.SPromise.SDebugResolver(promise, debugNote);
    }
}