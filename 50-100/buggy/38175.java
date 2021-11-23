@java.lang.Override
protected boolean apply() {
    return ((solver.activateGoal(atom)) && (solver.add(solver.imply(in_plan, solver.eq(((it.cnr.istc.iloc.AtomFlaw) (effect)).atom.state, AtomState.Active))))) && (((it.cnr.istc.core.Predicate) (((it.cnr.istc.iloc.AtomFlaw) (effect)).atom.type)).apply(((it.cnr.istc.iloc.AtomFlaw) (effect)).atom));
}