private int generateInitialGroupSize() {
    int initialGroupSize = ((edu.umw.cpsc.collegesim.Sim.instance().random.nextInt(((edu.umw.cpsc.collegesim.Group.MAXIMUM_START_GROUP_SIZE) - (edu.umw.cpsc.collegesim.Group.MINIMUM_START_GROUP_SIZE)))) + (edu.umw.cpsc.collegesim.Group.MINIMUM_START_GROUP_SIZE)) + 1;
    if (initialGroupSize < (edu.umw.cpsc.collegesim.Group.MINIMUM_GROUP_SIZE)) {
        initialGroupSize = edu.umw.cpsc.collegesim.Group.MINIMUM_GROUP_SIZE;
    }
    if (initialGroupSize > (edu.umw.cpsc.collegesim.Sim.getNumPeople())) {
        initialGroupSize = edu.umw.cpsc.collegesim.Sim.getNumPeople();
    }
    return initialGroupSize;
}