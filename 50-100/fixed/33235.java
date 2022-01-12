private boolean shouldRun(final java.util.Set<java.util.Set<de.uni_freiburg.informatik.ultimate.plugins.generator.rcfgbuilder.cfg.CodeBlock>> knownPathPrograms, final de.uni_freiburg.informatik.ultimate.automata.IRun<de.uni_freiburg.informatik.ultimate.plugins.generator.rcfgbuilder.cfg.CodeBlock, de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.predicates.IPredicate> currentCex) {
    final java.util.Set<de.uni_freiburg.informatik.ultimate.plugins.generator.rcfgbuilder.cfg.CodeBlock> transitions = new java.util.HashSet<de.uni_freiburg.informatik.ultimate.plugins.generator.rcfgbuilder.cfg.CodeBlock>();
    final int length = currentCex.getLength();
    for (int i = 0; i < (length - 1); ++i) {
        transitions.add(currentCex.getSymbol(i));
    }
    return knownPathPrograms.add(transitions);
}