public Action takeAction(SimulationController _controller) {
    if ((actionList.size()) == 0) {
        Simulation.ui.promptForHouseholdAction(household, actionList);
    }
    if ((actionList.size()) == 0) {
        return null;
    }
    Action action = actionList.get(((actionList.size()) - 1));
    actionList.remove(((actionList.size()) - 1));
    return action;
}