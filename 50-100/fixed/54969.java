public java.util.List<ch.comgr.particleswarm.util.Tuple<ch.comgr.particleswarm.model.BaseSwarmObject, java.lang.Float>> getNeighbours(float maximalDistance) {
    java.util.List<ch.comgr.particleswarm.util.Tuple<ch.comgr.particleswarm.model.BaseSwarmObject, java.lang.Float>> n = new java.util.ArrayList<>();
    for (ch.comgr.particleswarm.model.BaseSwarmObject b : swarm) {
        if (b.equals(this))
            continue;
        
        float distance = b.getDistanceTo(this);
        if (distance <= maximalDistance)
            n.add(new ch.comgr.particleswarm.util.Tuple(b, distance));
        
    }
    return n;
}