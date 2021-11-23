public static void worldTimeStep() {
    assignment4.Critter.doAllTimeSteps();
    assignment4.Critter.doEncounters();
    assignment4.Critter.updateRestEnergy();
    assignment4.Critter.removeDead();
    assignment4.Critter.updatePosition();
    assignment4.Critter.generateAlgae();
    assignment4.Critter.addBabies();
    assignment4.Critter.resetHasMoved();
}