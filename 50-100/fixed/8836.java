private void remap(wyautl.core.Automaton automaton, int from, int to) {
    for (int i = 0; i != (automaton.nStates()); ++i) {
        automaton.get(i).remap(from, to);
    }
}