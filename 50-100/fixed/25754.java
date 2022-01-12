public hopshackle.simulation.OpenLoopState<A> getNextState(hopshackle.simulation.OpenLoopState<A> startState, hopshackle.simulation.ActionEnum<A> actionTaken) {
    java.util.Map<hopshackle.simulation.ActionEnum<A>, hopshackle.simulation.OpenLoopState<A>> fromMap = tree.getOrDefault(startState, new java.util.HashMap<>());
    if (fromMap.containsKey(actionTaken))
        return fromMap.get(actionTaken);
    
    return startState;
}