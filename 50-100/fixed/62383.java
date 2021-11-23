private org.ggp.base.util.propnet.polymorphic.PolymorphicProposition recordInitProposition() {
    for (org.ggp.base.util.propnet.polymorphic.PolymorphicProposition proposition : propositions) {
        if (!((proposition.getName()) instanceof org.ggp.base.util.gdl.grammar.GdlProposition))
            continue;
        
        org.ggp.base.util.gdl.grammar.GdlConstant constant = ((org.ggp.base.util.gdl.grammar.GdlProposition) (proposition.getName())).getName();
        if (constant.getValue().toUpperCase().equals("INIT")) {
            return proposition;
        }
    }
    return null;
}