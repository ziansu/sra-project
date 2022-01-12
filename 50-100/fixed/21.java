@java.lang.Override
public void evaluateIndividual(ec.EvolutionState state, ec.Individual ind, int subpop) {
    while (true) {
        synchronized(toBeEvaluatedIndividuals) {
            if ((toBeEvaluatedIndividuals.size()) < 100) {
                toBeEvaluatedIndividuals.addLast(new ec.steadystate.QueueIndividual(ind, subpop));
                return ;
            }
        }
    } 
}