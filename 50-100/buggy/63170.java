public org.squiddev.cobalt.debug.DebugInfo onCall(org.squiddev.cobalt.debug.DebugState ds, org.squiddev.cobalt.function.LuaClosure func, org.squiddev.cobalt.debug.Varargs args, org.squiddev.cobalt.debug.LuaValue[] stack) {
    if (ds.inhook)
        return null;
    
    org.squiddev.cobalt.debug.DebugInfo di = ds.pushInfo();
    di.setFunction(func, args, stack);
    if (ds.hookcall)
        ds.callHookFunc(org.squiddev.cobalt.debug.DebugHandler.CALL, org.squiddev.cobalt.Constants.NIL);
    
    return di;
}