public void resetFootAngularVelocitiesFiltered() {
    for (us.ihmc.robotics.screwTheory.RigidBody foot : feet) {
        footAngularVelocitiesInWorldFilteredX.get(foot).set(0.0);
        footAngularVelocitiesInWorldFilteredY.get(foot).set(0.0);
        footAngularVelocitiesInWorldFilteredZ.get(foot).set(0.0);
    }
    footAngularVelocityAverageFiltered.setToZero();
}