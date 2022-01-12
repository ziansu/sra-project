private static water.fvec.Frame register(water.fvec.Frame f) {
    if ((f._key) != null)
        water.DKV.put(f._key, f);
    
    water.rapids.ast.prims.reducers.AstMeanTest.allFrames.add(f);
    return f;
}