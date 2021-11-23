public final byte[] memOrLoad() {
    byte[] mem = _mem;
    if (mem != null)
        return mem;
    
    water.Freezable pojo = _pojo;
    if (pojo != null)
        _mem = pojo.asBytes();
    
    if ((_max) == 0)
        return _mem = new byte[0];
    
    return _mem = loadPersist();
}