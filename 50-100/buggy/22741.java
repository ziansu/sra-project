public void dynamic(boolean dynamic) {
    if (dynamic) {
        scene.world.removeRigidBody(body);
        mass(lastNonZeroMass);
        scene.world.addRigidBody(body);
        body.activate();
    }else {
        body.setMassProps(0, new javax.vecmath.Vector3f());
    }
}