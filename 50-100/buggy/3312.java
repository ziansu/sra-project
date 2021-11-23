@java.lang.Override
public wyal.lang.Proof.State apply(wyal.lang.Proof.State state, wyal.lang.Formula truth) {
    wyal.lang.Formula expanded = expandFormula(truth);
    if (expanded != null) {
        expanded = state.allocate(expanded);
        state = state.subsume(this, truth, expanded);
    }
    return state;
}