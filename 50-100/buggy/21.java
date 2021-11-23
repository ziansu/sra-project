@java.lang.Override
public void evaluateIndividual(ec.EvolutionState state, ec.Individual ind, int subpop) {
    try {
        java.lang.Thread.sleep(100);
    } catch (java.lang.InterruptedException e) {
    }
    synchronized(toBeEvaluatedIndividuals) {
        toBeEvaluatedIndividuals.addLast(new ec.steadystate.QueueIndividual(ind, subpop));
        toBeEvaluatedIndividuals.notify();
    }
}