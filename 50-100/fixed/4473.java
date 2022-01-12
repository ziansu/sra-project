@java.lang.Override
public void initialize(java.util.List<org.ggp.base.util.gdl.grammar.Gdl> description) {
    try {
        propNet = org.ggp.base.util.propnet.factory.OptimizingPropNetFactory.create(description);
        roles = propNet.getRoles();
        ordering = getOrdering();
        p(propNet.toString());
    } catch (java.lang.InterruptedException e) {
        throw new java.lang.RuntimeException(e);
    }
}