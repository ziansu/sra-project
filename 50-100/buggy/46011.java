public Action takeAction(SimulationController _controller) {
    if ((actionList.size()) == 0) {
        Simulation.ui.promptForHouseholdAction(household, actionList);
    }
    Action action = actionList.get(actionList.size());
    actionList.remove(actionList.size());
    return action;
}