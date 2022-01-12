private void markBaseProps(java.util.Set<org.ggp.base.util.gdl.grammar.GdlSentence> stateSentences) {
    java.util.Map<org.ggp.base.util.gdl.grammar.GdlSentence, org.ggp.base.util.propnet.architecture.components.Proposition> props = propNet.getBasePropositions();
    for (java.util.Map.Entry<org.ggp.base.util.gdl.grammar.GdlSentence, org.ggp.base.util.propnet.architecture.components.Proposition> entry : props.entrySet()) {
        org.ggp.base.util.propnet.architecture.components.Proposition prop = entry.getValue();
        boolean value = stateSentences.contains(entry.getKey());
        prop.setValue(value);
    }
}