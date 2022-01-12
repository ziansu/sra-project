public static void simplify(wyil.util.type.Automaton automaton) {
    boolean changed = true;
    while (changed) {
        changed = false;
        for (int i = 0; i != (automaton.size()); ++i) {
            changed |= wyil.util.type.TypeAlgorithms.simplify(i, automaton);
        }
    } 
}