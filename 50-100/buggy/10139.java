public boolean accepts(rocnikovyprojekt.Word w) {
    rocnikovyprojekt.FSA m = determinize().complete();
    java.lang.Object p = m.initialStates.iterator().next();
    for (int i = 0; i < (w.length()); i++) {
        java.lang.Object a = w.symbolAt(i);
        p = m.delta.get(p, a).iterator().next();
    }
    return m.finalStates.contains(p);
}