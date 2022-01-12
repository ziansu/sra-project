@java.lang.Override
public org.ggp.base.util.statemachine.MachineState toGdl(org.apache.lucene.util.OpenBitSet state) {
    java.util.Set<org.ggp.base.util.gdl.grammar.GdlSentence> bases = new java.util.HashSet<org.ggp.base.util.gdl.grammar.GdlSentence>();
    int[] baseProps = propNet.getBasePropositions();
    for (int i = state.nextSetBit(0); i != (-1); i = state.nextSetBit((i + 1))) {
        bases.add(gdlSentenceMap.get(((baseOffset) + i)));
    }
    return new org.ggp.base.util.statemachine.MachineState(bases);
}