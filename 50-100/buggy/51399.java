public rocnikovyprojekt.FSA complement() {
    rocnikovyprojekt.FSA m = determinize().complete();
    java.util.Set<java.lang.Object> Q = m.states;
    java.util.Set<java.lang.Object> A = m.symbols;
    rocnikovyprojekt.FSA.Delta D = m.delta;
    java.util.Set<java.lang.Object> I = m.initialStates;
    java.util.Set<java.lang.Object> T = rocnikovyprojekt.Sets.difference(Q, m.finalStates);
    return new rocnikovyprojekt.FSA(Q, A, D, I, T);
}