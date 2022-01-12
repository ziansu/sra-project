@java.lang.Override
public void step(sim.engine.SimState state) {
    edu.vt.ece5574.sim.Simulation simState = ((edu.vt.ece5574.sim.Simulation) (state));
    simState.getEventsForRobotID(robotID);
    currEvents.addAll(simState.getEventsForRobotID(robotID));
    if ((busy) == true) {
        reactToEvent();
    }
    if (currEvents.isEmpty()) {
        randomMovement(state);
    }else {
        dealWithEvents(state);
    }
}