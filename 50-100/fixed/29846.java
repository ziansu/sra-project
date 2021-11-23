@java.lang.Override
public void registerWatchModel(org.netbeans.modules.cnd.debugger.gdb2.WatchModel model) {
    if (Log.Variable.mi_vars) {
        java.lang.System.out.println(("registerWatchModel " + model));
    }
    watchUpdater().addListener(model);
    if (model != null) {
        get_watches = true;
        if ((state().isProcess) && (!(state().isRunning))) {
            updateWatches(true);
        }
    }else {
        get_watches = false;
    }
}