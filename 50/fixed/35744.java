public void addComponent(framework.ComponentBundle... cs) {
    if (hasComponent(cs))
        throw new java.lang.IllegalArgumentException("there is a component bundle that was already added. Duplication is not allowed.");
    
    for (framework.ComponentBundle cb : cs) {
        mComponentProducers.add(cb);
        mTrackSystems.track(cb);
    }
}