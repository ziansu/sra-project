private de.uni_freiburg.informatik.ultimate.automata.nwalibrary.operations.minimization.QuotientNwaConstructor<LETTER, STATE> minimize(final java.util.Collection<java.util.Set<STATE>> equivalenceClasses, final boolean addMapOldState2newState) throws de.uni_freiburg.informatik.ultimate.automata.AutomataOperationCanceledException {
    final de.uni_freiburg.informatik.ultimate.automata.nwalibrary.operations.minimization.MinimizeSevpa<LETTER, STATE>.StatesContainer states = new StatesContainer(mOperand);
    if (!(mServices.getProgressMonitorService().continueProcessing())) {
        throw new de.uni_freiburg.informatik.ultimate.automata.AutomataOperationCanceledException(this.getClass());
    }
    final de.uni_freiburg.informatik.ultimate.automata.nwalibrary.operations.minimization.QuotientNwaConstructor<LETTER, STATE> result = mergeStates(states, equivalenceClasses, addMapOldState2newState);
    return result;
}