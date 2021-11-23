public boolean markBases(org.ggp.base.util.statemachine.MachineState state) {
    java.util.Set<org.ggp.base.util.gdl.grammar.GdlSentence> gdls = state.getContents();
    for (org.ggp.base.util.gdl.grammar.GdlSentence gdl : gdls) {
        org.ggp.base.util.propnet.architecture.components.Proposition prop = bases.get(gdl);
        if (prop != null) {
            prop.setValue(true);
            bases.put(gdl, prop);
        }
    }
    return true;
}