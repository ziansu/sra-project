water.fvec.Chunk buildTestData(boolean withNA) {
    water.fvec.NewChunk nc = new water.fvec.NewChunk(null, 0);
    if (withNA)
        nc.addNA();
    
    for (java.util.UUID u : sampleVals)
        nc.addUUID(u.getLeastSignificantBits(), u.getMostSignificantBits());
    
    nc.addNA();
    return nc.compress();
}