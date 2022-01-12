private synchronized void processQueuedBodies() {
    while (!(insertionQueue.isEmpty())) {
        org.terasology.physics.bullet.BulletPhysics.RigidBodyRequest request = insertionQueue.poll();
        discreteDynamicsWorld.addRigidBody(request.body.rb, request.groups, request.filter);
    } 
    while (!(removalQueue.isEmpty())) {
        org.terasology.physics.bullet.BulletPhysics.BulletRigidBody body = removalQueue.poll();
        discreteDynamicsWorld.removeRigidBody(body.rb);
        body.dispose();
    } 
}