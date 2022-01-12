public java.util.List rayTest(com.jme3.math.Vector3f from, com.jme3.math.Vector3f to) {
    java.util.List results = new java.util.LinkedList();
    rayTest(from, to, results);
    if ((results.getFirst().getHitFraction()) > (results.getLast().getHitFraction())) {
        java.util.Collections.reverse(results);
    }
    return ((java.util.List<com.jme3.bullet.PhysicsRayTestResult>) (results));
}