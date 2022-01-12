public org.zoodb.internal.ZooClassDef getModifiableVersion(org.zoodb.internal.client.session.ClientSessionCache cache, java.util.List<org.zoodb.internal.client.SchemaOperation> ops, org.zoodb.internal.ZooClassDef newSuper) {
    if (this.jdoZooIsNew()) {
        ensureLatestSuper();
        return this;
    }
    org.zoodb.internal.ZooClassDef defNew = newVersion(cache, ops, newSuper);
    ops.add(new org.zoodb.internal.client.SchemaOperation.SchemaNewVersion(this, defNew, cache));
    for (org.zoodb.internal.ZooClassProxy sub : versionProxy.getSubProxies()) {
        sub.getSchemaDef().getModifiableVersion(cache, ops, defNew);
    }
    return defNew;
}