private boolean propmarkconjunction(org.ggp.base.util.propnet.architecture.Component cp) {
    java.util.Set<org.ggp.base.util.propnet.architecture.Component> sources = cp.getInputs();
    for (org.ggp.base.util.propnet.architecture.Component source : sources) {
        if (source.getValueIsCorrect()) {
            p("using cached value: propmarkconjunction");
            if (!(source.getValue()))
                return false;
            
        }
        if (!(propmarkp(source)))
            return false;
        
    }
    return true;
}