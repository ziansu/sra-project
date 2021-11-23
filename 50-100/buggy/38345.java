public static void print(int root, wyautl.core.Automaton automaton) {
    java.util.List<wyautl.core.Automaton.State> states = new java.util.ArrayList<wyautl.core.Automaton.State>();
    wyautl.core.Automata.extract(automaton, root, states);
    wyautl.core.Automaton subaut = new wyautl.core.Automaton(states.toArray(new wyautl.core.Automaton.State[states.size()]));
    subaut.setRoot(0, 0);
    types.core.RewritingSubtypeOperator.print(subaut);
}