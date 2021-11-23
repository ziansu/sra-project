@java.lang.Override
public void init(sim.engine.SimState state) {
    bountyState = ((sim.app.bounties.Bounties) (state));
    bondsman = bountyState.bondsman;
    curTask = decider.decideNextTask(bondsman.getAvailableTasks());
    numTimeSteps = 0;
    bondsman.doingTask(id, curTask.getID());
}