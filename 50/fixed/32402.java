public void reset(eta.runtime.stg.Capability cap, eta.runtime.stg.TSO t) {
    myCapability = cap;
    currentTSO = t;
    argStack = new eta.runtime.stg.ArgumentStack();
    if (t != null)
        t.reset();
    
}