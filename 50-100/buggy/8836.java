private void remap(wyautl.core.Automaton automaton, int from, int to) {
    for (int i = 0; i != (automaton.nStates()); ++i) {
        java.lang.System.out.println(("BEFORE: " + (automaton.get(i))));
        automaton.get(i).remap(from, to);
        java.lang.System.out.println(("AFTER: " + (automaton.get(i))));
    }
}