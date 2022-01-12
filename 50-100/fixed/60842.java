private boolean propmarkconjunction(org.ggp.base.util.propnet.architecture.Component cp) {
    java.util.Set<org.ggp.base.util.propnet.architecture.Component> sources = cp.getInputs();
    for (org.ggp.base.util.propnet.architecture.Component source : sources) {
        if (source.getValueIsCorrect()) {
        }
        if (!(propmarkp(source)))
            return false;
        
    }
    return true;
}