@java.lang.Override
public void step(sim.engine.SimState state) {
    edu.vt.ece5574.sim.Simulation simState = ((edu.vt.ece5574.sim.Simulation) (state));
    if ((busy) == true) {
        reactToEvent(simState);
    }
    currEvents = simState.getEventsForRobotID(robotID);
    if (!((currEvents) == null)) {
        if (currEvents.isEmpty()) {
            randomMovement(state);
        }else {
            dealWithEvents(state);
        }
    }
}