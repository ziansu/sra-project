@java.lang.Override
public void appendDependencies(java.util.Set<org.auraframework.def.DefDescriptor<?>> dependencies) {
    if (!(getExpressions().isEmpty())) {
        org.auraframework.def.DefDescriptor<org.auraframework.def.TokensDef> namespaceTokens = org.auraframework.impl.css.util.Tokens.namespaceDefaultDescriptor(descriptor);
        if (namespaceTokens.exists()) {
            dependencies.add(namespaceTokens);
        }
    }
    dependencies.add(org.auraframework.impl.css.util.Flavors.toComponentDescriptor(getDescriptor()));
}