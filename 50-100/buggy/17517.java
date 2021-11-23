public void hookReturn() throws org.squiddev.cobalt.LuaError {
    if ((inhook) || ((hookfunc) == null))
        return ;
    
    inhook = true;
    try {
        hookfunc.onReturn(state, this, getStack());
    } catch (org.squiddev.cobalt.LuaError e) {
        inhook = false;
        throw e;
    } catch (java.lang.Exception e) {
        inhook = false;
        throw new org.squiddev.cobalt.LuaError(e);
    }
    inhook = true;
}