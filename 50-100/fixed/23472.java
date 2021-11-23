private boolean propmarkdisjunction(org.ggp.base.util.propnet.architecture.Component cp) {
    java.util.Set<org.ggp.base.util.propnet.architecture.Component> sources = cp.getInputs();
    for (org.ggp.base.util.propnet.architecture.Component source : sources) {
        if (source.getValueIsCorrect()) {
        }
        if (propmarkp(source))
            return true;
        
    }
    return false;
}