public void hookInstruction(org.squiddev.cobalt.debug.DebugFrame frame) throws org.squiddev.cobalt.LuaError {
    if ((inhook) || ((hookfunc) == null))
        return ;
    
    inhook = true;
    try {
        hookfunc.onCount(state, this, frame);
    } catch (org.squiddev.cobalt.LuaError e) {
        inhook = false;
        throw e;
    } catch (java.lang.Exception e) {
        inhook = false;
        throw new org.squiddev.cobalt.LuaError(e);
    }
    inhook = true;
}