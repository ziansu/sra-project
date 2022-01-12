public java.util.List rayTest(com.jme3.math.Vector3f from, com.jme3.math.Vector3f to) {
    java.util.LinkedList<com.jme3.bullet.PhysicsRayTestResult> results = new java.util.LinkedList<com.jme3.bullet.PhysicsRayTestResult>();
    rayTest(from, to, results);
    if ((results.getFirst().getHitFraction()) > (results.getLast().getHitFraction())) {
        java.util.Collections.reverse(results);
    }
    return results;
}