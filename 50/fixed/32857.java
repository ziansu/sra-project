@javax.annotation.Nonnull
@java.lang.Override
public org.raml.yagi.framework.nodes.Node apply(@javax.annotation.Nonnull
org.raml.yagi.framework.nodes.Node node) {
    if (matches(node)) {
        return createNodeUsingFactory(node);
    }else {
        return org.raml.yagi.framework.grammar.rule.ErrorNodeFactory.createInvalidMaxProperties(maxProperties);
    }
}