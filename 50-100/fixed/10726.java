public synchronized void removeFromCursor(com.gdo.stencils.StclContext stclContext, com.gdo.stencils.key.IKey key) {
    com.gdo.stencils.plug.PStcl stcl = _stencils.get(key);
    _stencils.remove(key);
    _modified.remove(key);
    _locked.remove(key);
    if (stcl != null) {
    }
}