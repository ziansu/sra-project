public boolean collidesWithFace(entities.Ball b) {
    org.lwjgl.util.vector.Vector3f closest = toolbox.Maths.closestPtPointTriangle(b.getPosition(), point1, point2, point3);
    org.lwjgl.util.vector.Vector3f.sub(b.getPosition(), closest, dist);
    if ((dist.length()) <= (entities.Ball.RADIUS))
        return true;
    
    return false;
}