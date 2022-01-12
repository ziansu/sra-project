@java.lang.Override
public org.ggp.base.util.statemachine.MachineState toGdl(org.apache.lucene.util.OpenBitSet state) {
    java.util.Set<org.ggp.base.util.gdl.grammar.GdlSentence> bases = new java.util.HashSet<org.ggp.base.util.gdl.grammar.GdlSentence>();
    for (int i = state.nextSetBit(0); i != (-1); i = state.nextSetBit((i + 1))) {
        bases.add(((org.ggp.base.util.gdl.grammar.GdlSentence) (machine.gdlSentenceMap.get(i))));
    }
    return new org.ggp.base.util.statemachine.MachineState(bases);
}