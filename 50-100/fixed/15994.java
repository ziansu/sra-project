public java.util.List<ftb.utils.world.claims.ClaimedChunk> getAllChunks() {
    java.util.ArrayList<ftb.utils.world.claims.ClaimedChunk> l = new java.util.ArrayList<>();
    for (java.util.Map<java.lang.Long, ftb.utils.world.claims.ClaimedChunk> m : chunks.values())
        l.addAll(m.values());
    
    return l;
}