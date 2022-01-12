public com.evolveum.midpoint.model.impl.lens.ResourceObjectTypeDefinitionType getResourceObjectTypeDefinitionType() {
    if ((synchronizationPolicyDecision) == (com.evolveum.midpoint.model.api.context.SynchronizationPolicyDecision.BROKEN)) {
        return null;
    }
    com.evolveum.midpoint.schema.ResourceShadowDiscriminator discr = getResourceShadowDiscriminator();
    if (discr == null) {
        return null;
    }
    if ((resource) == null) {
        return null;
    }
    com.evolveum.midpoint.model.impl.lens.ResourceObjectTypeDefinitionType def = com.evolveum.midpoint.schema.util.ResourceTypeUtil.getResourceObjectTypeDefinitionType(resource, discr.getKind(), discr.getIntent());
    return def;
}