private org.gradle.api.internal.artifacts.ivyservice.resolveengine.excludes.AbstractModuleExclusion maybeMergeIntoUnion(org.gradle.api.internal.artifacts.ivyservice.resolveengine.excludes.ModuleExclusion one, org.gradle.api.internal.artifacts.ivyservice.resolveengine.excludes.ModuleExclusion two) {
    if ((one instanceof org.gradle.api.internal.artifacts.ivyservice.resolveengine.excludes.IntersectionExclusion) && (two instanceof org.gradle.api.internal.artifacts.ivyservice.resolveengine.excludes.IntersectionExclusion)) {
        return maybeMergeIntoUnion(((org.gradle.api.internal.artifacts.ivyservice.resolveengine.excludes.IntersectionExclusion) (one)), ((org.gradle.api.internal.artifacts.ivyservice.resolveengine.excludes.IntersectionExclusion) (two)));
    }
    return null;
}