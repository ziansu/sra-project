public ftb.utils.world.claims.ClaimedChunk remove(int dim, int cx, int cz) {
    java.util.HashMap<java.lang.Long, ftb.utils.world.claims.ClaimedChunk> map = chunks.get(dim);
    if (map != null) {
        ftb.utils.world.claims.ClaimedChunk chunk = map.remove(java.lang.Long.valueOf(ftb.utils.world.claims.Bits.intsToLong(cx, cz)));
        if (chunk != null) {
            if (map.isEmpty())
                chunks.remove(dim);
            
            return chunk;
        }
    }
    return null;
}