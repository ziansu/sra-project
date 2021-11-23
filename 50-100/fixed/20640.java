@java.lang.Override
public <T> boolean isMatching(org.gradle.api.attributes.Attribute<T> attribute, T candidate, T requested) {
    org.gradle.internal.component.model.DefaultCompatibilityCheckResult<java.lang.Object> result = new org.gradle.internal.component.model.DefaultCompatibilityCheckResult<java.lang.Object>(requested, candidate);
    effectiveSchema.matchValue(attribute, result);
    return result.isCompatible();
}