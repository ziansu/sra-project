long getZobristKey(java.util.HashSet<java.lang.String> wPawns, java.util.HashSet<java.lang.String> bPawns) {
    long zobristKey = 0;
    for (java.lang.String wPos : wPawns)
        zobristKey ^= wZobrist.get(wPos);
    
    for (java.lang.String bPos : wPawns)
        zobristKey ^= bZobrist.get(bPos);
    
    return zobristKey;
}