public boolean initProcesso(Engine.Processo p) {
    boolean ok = checkProcesso(p);
    if (ok) {
        persistProcesso(p);
        sendInfoByEmail(p, ok);
    }else
        sendInfoByEmail(p, ok);
    
    return ok;
}