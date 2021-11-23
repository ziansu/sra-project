public void onReturn(org.squiddev.cobalt.debug.DebugState ds) {
    try {
        if ((!(ds.inhook)) && (ds.hookrtrn))
            ds.callHookFunc(org.squiddev.cobalt.debug.DebugHandler.RETURN, org.squiddev.cobalt.Constants.NIL);
        
    } finally {
        ds.popInfo();
    }
}