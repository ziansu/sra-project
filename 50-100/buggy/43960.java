public Metadata.Builder putStandardMethodUnderrides(org.inferred.freebuilder.processor.Metadata.StandardMethod key, org.inferred.freebuilder.processor.Metadata.UnderrideLevel value) {
    com.google.common.base.Preconditions.checkNotNull(key);
    com.google.common.base.Preconditions.checkNotNull(value);
    com.google.common.base.Preconditions.checkArgument((!(standardMethodUnderrides.containsKey(key))), "Key already present in standardMethodUnderrides: %s", key);
    this.standardMethodUnderrides.put(key, value);
    return ((org.inferred.freebuilder.processor.Metadata.Builder) (this));
}