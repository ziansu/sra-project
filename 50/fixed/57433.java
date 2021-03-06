public void onCall(org.squiddev.cobalt.debug.DebugState ds, org.squiddev.cobalt.function.LuaFunction func) {
    org.squiddev.cobalt.debug.DebugInfo di = ds.pushInfo();
    di.setFunction(func);
    if ((!(ds.inhook)) && (ds.hookcall))
        ds.callHookFunc(org.squiddev.cobalt.debug.DebugHandler.CALL, org.squiddev.cobalt.Constants.NIL);
    
}