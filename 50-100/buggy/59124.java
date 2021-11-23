public boolean put(ftb.utils.world.claims.ClaimedChunk c) {
    if (c == null)
        return false;
    
    java.util.HashMap<java.lang.Long, ftb.utils.world.claims.ClaimedChunk> map = chunks.get(c.dim);
    if (map == null)
        chunks.put(c.dim, (map = new java.util.HashMap<>()));
    
    return (map.put(c.getLongPos(), c)) == null;
}