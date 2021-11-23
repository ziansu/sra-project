private boolean addLink(com.temenos.interaction.core.hypermedia.Transition transition, com.temenos.interaction.core.command.InteractionContext ctx, com.temenos.interaction.core.resource.EntityResource<?> er, com.temenos.interaction.core.rim.HTTPHypermediaRIM rimHander) {
    boolean addLink = true;
    com.temenos.interaction.core.hypermedia.expression.Expression conditionalExp = transition.getCommand().getEvaluation();
    if (conditionalExp != null) {
        try {
            addLink = conditionalExp.evaluate(rimHander, ctx, er.clone());
        } catch (java.lang.CloneNotSupportedException cnse) {
            throw new java.lang.RuntimeException("Failed to clone EntityResource", cnse);
        }
    }
    return addLink;
}