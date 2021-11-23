public void dynamic(boolean dynamic) {
    if (dynamic) {
        scene.world.removeRigidBody(body);
        mass(lastNonZeroMass);
        scene.world.addRigidBody(body);
        body.activate();
    }else {
        lastNonZeroMass = mass();
        mass(0);
    }
}