public void init(sim.engine.SimState state) {
    bountyState = ((sim.app.bounties.Bounties) (state));
    bondsman = bountyState.bondsman;
    decider.decideNextTask(((sim.app.bounties.Task[]) (bondsman.getAvailableTasks().toArray())));
    numTimeSteps = 0;
    bondsman.doingTask(id, curTask.getID());
}