public void addGravitationForces() {
    for (com.github.infosimulators.physic.PhysicsObject object : spaceRegister) {
        for (com.github.infosimulators.physic.PhysicsObject other : spaceRegister) {
            if (object == other)
                continue;
            
            object.appendForce(com.github.infosimulators.physic.Space.gravitation(object, other));
        }
    }
}