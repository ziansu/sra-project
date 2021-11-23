@java.lang.Override
public ec.Individual newIndividual(ec.EvolutionState state, int thread) {
    ec.graph.GraphIndividual ind = createNewBranchedGraph(null, state, ((ec.graph.GraphInitializer) (state.initializer)).taskTree);
    return ind;
}