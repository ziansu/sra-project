private void updateTrustedFeetLists() {
    listOfTrustedFeet.clear();
    listOfUnTrustedFeet.clear();
    for (int i = 0; i < (feet.size()); i++) {
        us.ihmc.robotics.screwTheory.RigidBody foot = feet.get(i);
        if (areFeetTrusted.get(foot).getBooleanValue())
            listOfTrustedFeet.add(foot);
        else
            listOfUnTrustedFeet.add(foot);
        
    }
}