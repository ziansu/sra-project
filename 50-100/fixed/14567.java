@java.lang.Override
public void initialize(java.util.List<org.ggp.base.util.gdl.grammar.Gdl> description) {
    try {
        propNet = org.ggp.base.util.propnet.factory.OptimizingPropNetFactory.create(description);
        roles = propNet.getRoles();
        bases = propNet.getBasePropositions();
        actions = propNet.getInputPropositions();
    } catch (java.lang.InterruptedException e) {
        throw new java.lang.RuntimeException(e);
    }
}