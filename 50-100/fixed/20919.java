public void destroy() {
    io.github.totom3.scripts.internal.ScriptsEventManager.get().unregisterAll(this);
    io.github.totom3.scripts.internal.ScriptsScheduler.get().unregisterAll(this);
    localBindings.clear();
    world = null;
    if ((io.github.totom3.scripts.internal.JSEngine.isExecuting()) && ((this) == (io.github.totom3.scripts.internal.JSEngine.getContext()))) {
        throw new io.github.totom3.scripts.internal.ExitScriptException(ExitScriptException.CURRENT);
    }
}