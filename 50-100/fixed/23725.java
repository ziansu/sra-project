public boolean markBases(org.ggp.base.util.statemachine.MachineState state) {
    java.util.Set<org.ggp.base.util.gdl.grammar.GdlSentence> gdls = state.getContents();
    for (org.ggp.base.util.propnet.architecture.components.Proposition prop : bases.values()) {
        if (gdls.contains(prop.getName())) {
            prop.setValue(true);
        }else {
            prop.setValue(false);
        }
    }
    return true;
}