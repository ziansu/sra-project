@java.lang.Deprecated
@java.lang.Override
public org.xwiki.model.reference.EntityReference resolveEntityReference(java.lang.String name, org.xwiki.model.EntityType type) {
    return relativeRefResolver.resolve(name, type);
}