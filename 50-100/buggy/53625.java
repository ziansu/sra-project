private void updatePhysics() {
    final double PFPS = 60;
    final long nsBetweenFrames = ((long) ((java.lang.Math.pow(10, 9)) / PFPS));
    final long now = java.lang.System.nanoTime();
    while ((now - (lastPhysicsTime)) > nsBetweenFrames) {
        p.update();
        lastPhysicsTime += nsBetweenFrames;
    } 
}