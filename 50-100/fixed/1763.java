public static <I> java.util.List<net.automatalib.words.Word<I>> transitionCover(net.automatalib.automata.DeterministicAutomaton<?, I, ?> automaton, java.util.Collection<? extends I> inputs) {
    java.util.List<net.automatalib.words.Word<I>> all = new java.util.ArrayList(((automaton.size()) * (inputs.size())));
    net.automatalib.util.automata.Automata.cover(automaton, inputs, null, all);
    return all;
}