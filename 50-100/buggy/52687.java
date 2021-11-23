private void updateTrustedFeetLists() {
    listOfTrustedFeet.clear();
    listOfUnTrustedFeet.clear();
    for (us.ihmc.robotics.screwTheory.RigidBody foot : feet) {
        if (areFeetTrusted.get(foot).getBooleanValue())
            listOfTrustedFeet.add(foot);
        else
            listOfUnTrustedFeet.add(foot);
        
    }
}