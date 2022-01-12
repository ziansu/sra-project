public rocnikovyprojekt.FSA complement() {
    rocnikovyprojekt.FSA m = determinize();
    java.util.Set<java.lang.Object> Q = m.states;
    java.util.Set<java.lang.Object> A = m.symbols;
    rocnikovyprojekt.FSA.Delta D = m.delta;
    java.util.Set<java.lang.Object> I = m.initialStates;
    java.util.Set<java.lang.Object> T = rocnikovyprojekt.Sets.difference(m.states, m.finalStates);
    return new rocnikovyprojekt.FSA(Q, A, D, I, T);
}