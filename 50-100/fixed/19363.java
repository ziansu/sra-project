public void resetFootAngularVelocitiesFiltered() {
    for (int i = 0; i < (feet.size()); i++) {
        us.ihmc.robotics.screwTheory.RigidBody foot = feet.get(i);
        footAngularVelocitiesInWorldFilteredX.get(foot).set(0.0);
        footAngularVelocitiesInWorldFilteredY.get(foot).set(0.0);
        footAngularVelocitiesInWorldFilteredZ.get(foot).set(0.0);
    }
    footAngularVelocityAverageFiltered.setToZero();
}