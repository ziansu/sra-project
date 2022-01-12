public void hookLine(org.squiddev.cobalt.debug.DebugFrame frame, int oldLine, int newLine) throws org.squiddev.cobalt.LuaError {
    if ((inhook) || ((hookfunc) == null))
        return ;
    
    inhook = true;
    try {
        hookfunc.onLine(state, this, frame, oldLine, newLine);
    } catch (org.squiddev.cobalt.LuaError e) {
        inhook = false;
        throw e;
    } catch (java.lang.Exception e) {
        inhook = false;
        throw new org.squiddev.cobalt.LuaError(e);
    }
    inhook = false;
}